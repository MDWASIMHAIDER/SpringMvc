package com.nt.bo;

public class StudentBO  extends BaseBO{
		private String course;

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}
		@Override
		public String toString() {
			return "EmployeeBO [desg=" + course + ", getName()=" + getName() + ", getAddrs()=" + getAddress() + ", getEmail()="
					+ getEmail() + ", getMobileNo()=" + getMobile() + ", getDoj()=" + getDoj() + "]";
		}


		

		
}
