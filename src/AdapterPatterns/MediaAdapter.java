package AdapterPatterns;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType){
		   
	      if(audioType.equalsIgnoreCase("vlc") ){
	    	 /*
	    	  * You can never instantiate an interface in java. 
	    	  * You can, however, refer to an object that implements an interface by the type of the interface. 
	    	  * For example,

					public interface A
					{
					}
					public class B implements A
					{
					}
					
					public static void main(String[] args)
					{
					    A test = new B();
					    //A test = new A(); // wont compile
					}
	    	  * 
	    	  *  
	    	  */
	         advancedMusicPlayer = new VlcPlayer();			
	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new Mp4Player();
	      }	
	}
	
	@Override
	public void play(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playVlc(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playMp4(fileName);
	      }
	 }

}
