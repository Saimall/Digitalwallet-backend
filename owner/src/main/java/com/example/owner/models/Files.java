package com.example.owner.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;





@Entity
public class Files extends Layout {
	
	
	public Files() {
		
	}
	
	private String description;
	
	private String name;
	
	  
	
	

	private  String imageType;

	    @Lob 
	    private String imageData;
	    
	    private String cloudinaryPublicId; 
	    
	    
	    public String getCloudinaryPublicId() {
			return cloudinaryPublicId;
		}

		public void setCloudinaryPublicId(String cloudinaryPublicId) {
			this.cloudinaryPublicId = cloudinaryPublicId;
		}

		
	
	public Files(int userid, int number, String entityName, String description, String name) {
        super(number, entityName,userid);
        this.description = description;
        this.name = name;
       
    }
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	 public String getImageType() {
			return imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}

		public String getImageData() {
			return imageData;
		}

		public void setImageData(String string) {
			this.imageData = string;
		}
	

}


