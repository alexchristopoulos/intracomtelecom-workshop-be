package com.intracomtelecom.workshop.be.index;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.intracomtelecom.workshop.be.index.IndexEntity;

@Path("/")
public class IndexService {
 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public IndexEntity getIndex() {
		 
		return new IndexEntity();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public IndexEntity getIndexWithParam(IndexEntity sentEntity) {
 
		return new IndexEntity(sentEntity.getMessage());
	}
 
}