package com.nt.beans;

public class College {

		private String collegeName;
		private String collegeLocation;
		
		public College(String collegeName, String collegeLocation) {
			
			this.collegeName = collegeName;
			this.collegeLocation = collegeLocation;
		}

		@Override
		public String toString() {
			return "College [collegeName=" + collegeName + ", college Location=" + collegeLocation + "]";
		}
		
}
