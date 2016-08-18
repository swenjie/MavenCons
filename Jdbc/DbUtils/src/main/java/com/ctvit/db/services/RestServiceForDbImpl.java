package com.ctvit.db.services;

import javax.servlet.http.HttpServletRequest;
import net.sf.json.JSONObject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;
import com.ctvit.db.beans.UserInfo;

/*
     注释（Annotation）：在 javax.ws.rs.* 中定义，是 JAX-RS (JSR 311) 规范的一部分。
    @Path：定义资源基 URI。由上下文根和主机名组成，资源标识符类似于
     	http://localhost:8080/RESTful/rest/hello。
    @GET：这意味着以下方法可以响应 HTTP GET 方法。
    @Produces：以纯文本方式定义响应内容 MIME 类型。

    @Context： 使用该注释注入上下文对象，比如 Request、Response、UriInfo、ServletContext 等。
    @Path("{contact}")：这是 @Path 注释，与根路径 “/contacts” 结合形成子资源的 URI。
    @PathParam("contact")：该注释将参数注入方法参数的路径，
    	在本例中就是联系人 id。其他可用的注释有 @FormParam、@QueryParam 等。
    @Produces：响应支持多个 MIME 类型。在本例和上一个示例中，APPLICATION/XML 将是默认的 MIME 类型。
 */

@Path(value = "/sample")
public class RestServiceForDbImpl implements RestServiceForDb {

	@Context
	private UriInfo uriInfo;

	@Context
	private Request request;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String doGet() {
		return "this is get rest request";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/request/{param}")
	public String doRequest(@PathParam("param") String param, @Context HttpServletRequest servletRequest,
			@Context HttpServletResponse servletResponse) {
		System.out.println(servletRequest);
		System.out.println(servletResponse);
		System.out.println(servletRequest.getParameter("param"));
		System.out.println(servletRequest.getContentType());
		System.out.println(servletResponse.getCharacterEncoding());
		System.out.println(servletResponse.getContentType());
		return "success";
	}

	@GET
	@Path("/bean/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UserInfo getBean(@PathParam("id") int id) {
		System.out.println("####getBean#####");
		System.out.println("id:" + id);
		System.out.println("Method:" + request.getMethod());
		System.out.println("uri:" + uriInfo.getPath());
		System.out.println(uriInfo.getPathParameters());

		UserInfo user = new UserInfo();
		user.setId(id);
		// user.setName("JojO");
		return user;
	}

	@GET
	@Path("/message/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String getMessage(@PathParam("id") int id) {
		JSONObject jsonObject = new JSONObject();
		UserInfo user = new UserInfo();
		user.setId(id);
		// user.setName("JojO");

		return jsonObject.fromObject(user).toString();
	}

	/*
	 * @Consumes：声明该方法使用 HTML FORM。
	 * 
	 * @FormParam：注入该方法的 HTML 属性确定的表单输入。
	 * 
	 * @Response.created(uri).build()： 构建新的 URI
	 * 用于新创建的联系人（/contacts/{id}）并设置响应代码（201/created）。 您可以使用
	 * http://localhost:8080/Jersey/rest/contacts/<id> 访问新联系人
	 */
	@POST
	@Path("/postData")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UserInfo postData(UserInfo user) throws IOException {
		System.out.println(user);
		// user.setName("jojo##12321321");
		return user;
	}

	@PUT
	@Path("/putData/{id}")
	@Produces({ MediaType.APPLICATION_XML })
	public UserInfo putData(@PathParam("id") int id, UserInfo user) {
		System.out.println("#####putData#####");
		System.out.println(user);
		user.setId(id);
		//// user.setAddress("hoojo#gz");
		// user.setEmail("hoojo_@126.com");
		// user.setName("hoojo");
		System.out.println(user);
		return user;
	}

	@DELETE
	@Path("/removeData/{id}")
	public void deleteData(@PathParam("id") int id) {
		System.out.println("#######deleteData#######" + id);
	}
}
