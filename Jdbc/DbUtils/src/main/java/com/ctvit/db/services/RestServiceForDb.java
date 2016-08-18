package com.ctvit.db.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.ctvit.db.beans.UserInfo;

import java.io.IOException;

@Path(value = "/sample")
public interface RestServiceForDb {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String doGet();

	@GET  
    @Produces(MediaType.TEXT_PLAIN)  
    @Path("/request/{param}")  
    public String doRequest
    (@PathParam("param") String param,  
     @Context HttpServletRequest servletRequest, 
     @Context HttpServletResponse servletResponse) ;  

	@GET
	@Path("/bean/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UserInfo getBean(@PathParam("id") int id);

	@GET
	@Path("/message/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String getMessage(@PathParam("id") int id);

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
	public UserInfo postData(UserInfo user) throws IOException;

	@PUT
	@Path("/putData/{id}")
	@Produces({ MediaType.APPLICATION_XML })
	public UserInfo putData(@PathParam("id") int id, UserInfo user);

	@DELETE
	@Path("/removeData/{id}")
	public void deleteData(@PathParam("id") int id);
}
