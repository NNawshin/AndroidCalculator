package your.em.namespace;

//import n.emt.calculator.R;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SampleCalculatorActivity extends Activity {
    /** Called when the activity is first created. */
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
	Button btnadd,btnsub,btnmul,btndiv;
	Button btndot,btnHist,btnAC,btnb1,btnb2,btnEq,btnDEL;
	Button btnM,btnMC;
	EditText display;
	
	float mValueOne , mValueTwo ;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
	
    SharedPreferences pref;
    Editor editor;
    static final int READ_BLOCK_SIZE = 100;
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
	        
        pref =getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        editor = pref.edit();
        
        btn1 =(Button) findViewById(R.id.button1);
        btn2 =(Button) findViewById(R.id.button2);
        btn3 =(Button) findViewById(R.id.button3);
        btn4 =(Button) findViewById(R.id.button4);
        btn5 =(Button) findViewById(R.id.button5);
        btn6 =(Button) findViewById(R.id.button6);
        btn7 =(Button) findViewById(R.id.button7);
        btn8 =(Button) findViewById(R.id.button8);
        btn9 =(Button) findViewById(R.id.button9);
        btn0 =(Button) findViewById(R.id.button0);
        btnadd =(Button) findViewById(R.id.buttonPlus);
        btnsub =(Button) findViewById(R.id.buttonMin);
        btnmul =(Button) findViewById(R.id.buttonMul);
        btndiv =(Button) findViewById(R.id.buttonDiv);
        btndot =(Button) findViewById(R.id.buttonDot);
        btnEq =(Button) findViewById(R.id.buttonEq);
        btnHist =(Button) findViewById(R.id.buttonHist);
        btnAC=(Button) findViewById(R.id.buttonAC);
        btnDEL=(Button) findViewById(R.id.buttonDel);
        
        btnM =(Button) findViewById(R.id.buttonM);
       // btnMP =(Button) findViewById(R.id.buttonMP);
        //btnMM =(Button) findViewById(R.id.buttonMM);
        btnMC =(Button) findViewById(R.id.buttonMC);
        
        display = (EditText) findViewById(R.id.editText1);
        
        
       // a=(TextView)findViewById(R.id.textView1);
        //display.setKeyListener(null);
        btn1.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "1");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn2.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "2");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn3.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "3");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn4.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "4");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn5.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "5");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn6.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "6");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn7.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "7");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn8.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "8");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn9.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "9");
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				
				display.setText(txt+buttonTxt);
				
			}
		});
        
        btn0.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//display.setText(display.getText() + "0");
				
				Button btn=(Button)v;
				String buttonTxt=btn.getText().toString();
				
				String txt=display.getText().toString();
				boolean check = txt.equals("0");
				
				if(!check)
				{
					
					display.setText(txt+buttonTxt);
				}
			}
		});
        
        btndot.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String txt = display.getText().toString();
				StringBuilder txt1=new StringBuilder(txt);
				boolean check = txt.contains(".");
				
				if(!check)
				{
					display.setText(txt+".");
				}
				
			}
		});
        
 btnDEL.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				String txt =display.getText().toString();
				StringBuilder txt1=new StringBuilder(txt);
				if(!txt.equals(""))
				{
					txt1=new StringBuilder(txt);
					txt1.deleteCharAt(txt1.length()-1);
					display.setText(txt1.toString());
				}
				
		
				
			}
		});
        
        btnAC.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
					display.setText("");
				
				
			}
		});
	 btnadd.setOnClickListener(new View.OnClickListener() {
	     
	     public void onClick(View v) {
	    	 Button btn = (Button)v;
	    	 String txt = display.getText().toString();
	    	 
			try{
				StringBuilder txt1= new StringBuilder(txt);
				char lastChar = txt1.charAt(txt1.length()-1);
	    	 if(lastChar=='+'||lastChar=='-'||lastChar=='*'||lastChar=='/')
	    	 {
	    		 txt1.deleteCharAt(txt1.length()-1);
	    		 
	    		 display.setText((new String(txt1)+btn.getText()));
	    	 }
	    	 else
	    	 {
	    		 display.setText(txt+btn.getText());
	    	 }
			}catch(Exception e){}
	     
	    	 
	     }
	 });
 
 

	 btnsub.setOnClickListener(new View.OnClickListener() {
	     
	     public void onClick(View v) {
	    	 Button btn = (Button)v;
	    	 String txt = display.getText().toString();
	    	 try{
	    		 	StringBuilder txt1= new StringBuilder(txt);
					char lastChar = txt1.charAt(txt1.length()-1);
	    	 if(lastChar=='+'||lastChar=='-'||lastChar=='*'||lastChar=='/')
	    	 {
	    		 txt1.deleteCharAt(txt1.length()-1);
	    		 
	    		 display.setText((new String(txt1)+btn.getText()));
	    	 }
	    	 else
	    	 {
	    		 display.setText(txt+btn.getText());
	    	 }}
	    	 catch(Exception e){}
	     }
	 });

	 btnmul.setOnClickListener(new View.OnClickListener() {
	   
	     public void onClick(View v) {
	    	 
	    	 Button btn = (Button)v;
	    	 String txt = display.getText().toString();
	    	 try{
	    		 	StringBuilder txt1= new StringBuilder(txt);
					char lastChar = txt1.charAt(txt1.length()-1);
	    	 if(lastChar=='+'||lastChar=='-'||lastChar=='*'||lastChar=='/')
	    	 {
	    		 txt1.deleteCharAt(txt1.length()-1);
	    		 
	    		 display.setText((new String(txt1)+btn.getText()));
	    	 }
	    	 else
	    	 {
	    		 display.setText(txt+btn.getText());
	    	 }
	    	 }catch(Exception e){}
	     }
	 });
	
	 btndiv.setOnClickListener(new View.OnClickListener() {
	     
	     public void onClick(View v) {
	    	 Button btn = (Button)v;
	    	 String txt = display.getText().toString();
	    	 try{
	    		 	StringBuilder txt1= new StringBuilder(txt);
					char lastChar = txt1.charAt(txt1.length()-1);
	    	 if(lastChar=='+'||lastChar=='-'||lastChar=='*'||lastChar=='/')
	    	 {
	    		 txt1.deleteCharAt(txt1.length()-1);
	    		 
	    		 display.setText((new String(txt1)+btn.getText()));
	    	 }
	    	 else
	    	 {
	    		 display.setText(txt+btn.getText());
	    	 }
	    	 }
	    	 catch(Exception e){}
	     }
	 });
	 btnMC.setOnClickListener(new View.OnClickListener() {
			
     	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setMemory(null);
				
			}
		});
	 btnM.setOnClickListener(new View.OnClickListener() {
			
	     	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!(getMemory() == null))
				{
		                display.setText(getMemory());
	            }
				
			}
		});
	 
	
	
 
 btnEq.setOnClickListener(new View.OnClickListener() {
	 
     public void onClick(View v) {
    	 try{
    	 Expression e = new ExpressionBuilder(display.getText().toString()).build();
    	 double result;
    	 
    	 try{
    		result = e.evaluate();
    	
    		//appendHistoryData(result);
    		 String hist = display.getText().toString() + " = " + String.valueOf(result) + "\n";
             appendHistoryData(hist);
             appendFileData(hist);
             display.setText(String.valueOf(result));
    	 }
    	 catch(Exception ee)
    	 {
    		 
    	 }
    	 finally
    	 {
    		 
    	 }
    	 }
    	 catch(Exception e)
    	 {}
    	
     }
 });
 
 btnHist.setOnClickListener(new View.OnClickListener() {
	
		public void onClick(View v) {
			
			 Intent hist = new Intent(getBaseContext(),history.class);
             hist.putExtra("hist",getHistoryData());
             startActivity(hist);
		}
	});
    }

public boolean setHistoryData(String data)
{

    editor.putString("hist",data);
    editor.commit();

    return true;
}
private   boolean setMemory(String data)
{

    editor.putString("hist",data);
    editor.commit();

    return true;
}
public  String getMemory()
{
        return pref.getString("hist",null);
      
}
public  String getHistoryData()
{
    return pref.getString("hist",null);
}
public boolean appendHistoryData(String data)
{
	editor.putString("hist",getMemory() == null ? "0" : getMemory()+data);
    editor.commit();
    return true;
}
	private  void setFileData(String text)
	    {
	
	        try {
	            FileOutputStream fileout = openFileOutput("history.txt", MODE_PRIVATE);
	            OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
	            outputWriter.write(text);
	            outputWriter.close();
	 
	        } catch (FileNotFoundException e) {
	//            e.printStackTrace();
	        } catch (IOException e) {
	//            e.printStackTrace();
	        }
	
	
	    }
	
	    private  String getFileData()
	    {
	        String s="";
	        try {
	            FileInputStream fileIn=openFileInput("history.txt");
	            InputStreamReader InputRead= new InputStreamReader(fileIn);
	
	            char[] inputBuffer= new char[READ_BLOCK_SIZE];
	            int charRead;
	
	            while ((charRead=InputRead.read(inputBuffer))>0) {
	                // char to string conversion
	                String readstring=String.copyValueOf(inputBuffer,0,charRead);
	                s +=readstring;
	            }
	            InputRead.close();
	
	
	
	        } catch (Exception e) {
	
	        }
	
	        return  s;
	    }
	
	    private void appendFileData(String text)
	    {
	        setFileData(getFileData()+text);
	   }
}