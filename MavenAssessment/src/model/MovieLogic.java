package model;

/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Sep 6, 2021
 */
public class MovieLogic {
	

	public boolean isHorrorMovie(Movie movie) {
		if (movie.getGenre().equals("Horror") ) {
			return true;
		}else
		return false;
	}
		
		public String calculateGradeScore(Movie movie) {
			String letterGrade = "";
			int score = movie.getReviewScore();
			
		
			 
			 if(score < 60){ 
				 letterGrade = "F";
			          
			    }  
			    else if(score >=60 && score < 70){  
			    	letterGrade = "D";
			    	 
			    }  
			    else if(score >= 70 && score < 80){  
			    	 letterGrade = "C";
			    }  
			    else if(score >= 80 && score < 90){  
			    	  letterGrade = "B";
			    }  
			    else if(score >= 90 && score <= 100){  
			    	letterGrade = "A";
			    }else{  
			          letterGrade = "Error";
			    }
			 
			 
			 return letterGrade;
			
		}
	}


