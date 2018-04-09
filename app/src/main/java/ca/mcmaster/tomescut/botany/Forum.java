package ao4;

public class Forum {
	
	static String forumChoice;
	static String physResult;
	static String useResult;
	static String geoResult;
	
	public static String physExpert(){
		String colour = "yellow";
		String cluster = "flatOrRound";
		String leafShape = "lobed";
		String flowerShape = "eightOrMore";
		double size = 0.2;
				
		
		if (cluster == "flatOrRound" && (colour == "yellow" || leafShape == "lobed") || (colour == "yellow" && leafShape == "lobed")) {
			physResult = "Asteraceae";
			return physResult;
		}

		if (leafShape == "thinRays") {
			physResult = "ButtonBush";
			return physResult;
		}

		if (cluster == "flatOrRound" && (colour == "purple" || leafShape == "toothed")
				|| (colour == "purple" && leafShape == "toothed")) {
			physResult = "Carnation";
			return physResult;
		}

		if (flowerShape == "eightOrMore" && (cluster == "individual" || colour == "white"
				|| (size >= 0.1 && size <= 0.5) || leafShape == "smooth")) {
			physResult = "Daisy";
			return physResult;
		}

		if (cluster == "elongate" && (flowerShape == "six" || (size >= 0.75 && size <= 10))) {
			physResult = "Hyacinth";
			return physResult;
		}

		if (flowerShape == "five") {
			physResult = "Lily";
			return physResult;
		}

		if (cluster == "elongate" && (flowerShape == "three" || (size >= 2 && size <= 4))) {
			physResult = "Orchid";
			return physResult;
		}

		if (leafShape == "smooth" && (flowerShape == "six" || (colour == "red" || colour == "white"))
				|| (size >= 0.1 && size <= 0.5)) {
			physResult = "Rose";
			return physResult;
		}

		if (cluster == "individual" && flowerShape == "three") {
			physResult = "Trillium";
			return physResult;
		}

		if (cluster == "individual" && leafShape == "toothed") {
			physResult = "Tulip";
			return physResult;
		}

		if (colour == "yellow" && flowerShape == "irregular") {
			physResult = "Yellow Iris";
			return physResult;
		}

		else {
			physResult = "Idk";
			return physResult;
		}
	}
	
	public static String geoExpert(){
		String bloomTime = "May to July";
		String location = "Europe";
		
		
		if (bloomTime == "June to September"){
			geoResult = "Button Bush";
			return geoResult;
		}

		if (bloomTime == "May to July"){
			geoResult = "Yellow Iris";
			return geoResult;
		}
		
		if (bloomTime == "April to May"){
			geoResult = "Hyacinth";
			return geoResult;
		}
		
		if (bloomTime == "June to August" || location == "Oceania"){
			geoResult = "Orchid";
			return geoResult;
		}
		
		if (bloomTime == "April to November"){
			geoResult = "Daisy";
			return geoResult;
		}
		
		if (bloomTime == "June to November"){
			geoResult = "Lily";
			return geoResult;
		}
		
		if (location == "World wide"){
			geoResult = "Asteraceae";
			return geoResult;
		}
		
		if (bloomTime == "April to June" && location == "Asia"){
			geoResult = "Rose";
			return geoResult;
		}
		
		if (bloomTime == "April to June" && location == "Meditranean"){
			geoResult = "Carnation";
			return geoResult;
		}

		if (bloomTime == "April to June" && location == "Asia, Euorpe" ){
			geoResult = "Tulip";
			return geoResult;
		}
		
		if (bloomTime == "April to June" && location == "North America, Asia"){
			geoResult = "Trillium";
			return geoResult;
		}

		else{
			geoResult = "Idk";
			return geoResult;
		}
		
	}
	
	public static String useExpert(){
		String use = "Not any";
		
		if (use == "Edible"){
			useResult = "Daisy";
			return useResult;
		}

		if (use == "Perfumery"){
			useResult = "Orchid";
			return useResult;
		}
		
		if (use == "Floristy"){
			useResult = "Lily";
			return useResult;
		}
		
		else{
			useResult = "Idk";
			return useResult;		
		}
			
	}
	
	public static String physGet(){
		return physResult;
	}

	public static String geoGet(){
		return geoResult;
	}
	
	public static String useGet(){
		return useResult;
	}
	
	
	public static String ForumTest(String physResult, String useResult, String geoResult){
		

		if (physResult != "Idk" && useResult == geoResult && geoResult == physResult){
			forumChoice = physResult;
			return forumChoice;
		}

		if (physResult != "Idk" && physResult == geoResult){
			forumChoice = physResult;
			return forumChoice;
		}
		
		if (physResult != "Idk" && physResult == useResult){
			forumChoice = physResult;
			return forumChoice;
		}
		
		if (geoResult != "Idk" && useResult == geoResult){
			forumChoice = geoResult;
			return forumChoice;
		}
		
		if (physResult != "Idk"){
			forumChoice = physResult;
			return forumChoice;
		}
		
		if (geoResult != "Idk"){
			forumChoice = geoResult;
			return forumChoice;
		}

		if (useResult != "Idk"){
			forumChoice = useResult;
			return forumChoice;
		}
		
		
		else{
			forumChoice = "Idk";
			return forumChoice;
		}
		
	}

	public static void main(String[] args){
		physExpert();
		geoExpert();
		useExpert();
		
		System.out.println("Geo: " + geoGet());
		System.out.println("Phys: " + physGet());
		System.out.println("Use: " + useGet());
		System.out.print(ForumTest(physGet(), geoGet(), useGet()));
	}

}
