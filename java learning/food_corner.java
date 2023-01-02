class food_corner {
	public static void main(String[] args) {
		String ft="N";
		int q=2;
		int dist =3;
		float bill=0;
		
		if( ((ft == "N")||(ft=="V") )&& (q>=1) && (dist >0)){
		
		if(ft=="N")
		{
		   if(dist<=3){
		    bill=q*15;
		   }
		   else if(dist>3 && dist <=6){
		   bill=q*15+1;
		   }
		   else{
		   bill=q*15+2;
		   }
		   
		}
		
		else if(ft=="V"){
		
		if(dist<=3){
		    bill=q*12;
		   }
		   else if(dist>3 && dist <=6){
		   bill=q*12+1;
		   }
		   else{
		   bill=q*12+2;
		   }
		
		}
		
		}
		
		else{
		bill=-1;
		}
		
		System.out.println(bill);
		
	}
}