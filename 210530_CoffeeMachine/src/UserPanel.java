
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * 
 */
public class UserPanel {
	public static void main(String[] args) {
		UserPanel up = new UserPanel();
	}

	/**
	 * Default constructor
	 */
	public UserPanel() {
		JFrame panelWrapper = new JFrame("제목");
		panelWrapper.setLayout(null);
		panelWrapper.setBackground(new Color(204, 204, 255));
		panelWrapper.setVisible(true);
		panelWrapper.setSize(700, 500);
		panelWrapper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel darkGrayJPanel = new JPanel();		
		darkGrayJPanel.setBackground(new Color(80, 80, 80));
		panelWrapper.add(darkGrayJPanel);
		darkGrayJPanel.setBounds(0, 0, 500, 500);
		darkGrayJPanel.setLayout(null);

		JPanel whiteJPanel = new JPanel();		
		whiteJPanel.setBackground(new Color(255, 255, 255));
		darkGrayJPanel.add(whiteJPanel);
		whiteJPanel.setBounds(10, 10, 300, 440);
		whiteJPanel.setLayout(null);

		/************ P Coffee *****************/

		JLabel labelPremiumCoffee = new JLabel("고급커피");
		labelPremiumCoffee.setHorizontalAlignment(SwingConstants.LEFT);
		labelPremiumCoffee.setBounds(20, 7, 57, 14);
		whiteJPanel.add(labelPremiumCoffee);

		JPanel panelPremium = new JPanel();
		panelPremium.setBackground(new Color(204, 204, 255));
		panelPremium.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		whiteJPanel.add(panelPremium);
		panelPremium.setBounds(8, 23, 287, 72);
		panelPremium.setLayout(null);

		btnPBlackCoffee.setBackground(Color.DARK_GRAY);
		btnPBlackCoffee.setForeground(new Color(255, 51, 51));
		btnPBlackCoffee.setBounds(1, 57, 95, 15);
		panelPremium.add(btnPBlackCoffee);

		Label labelPBlackCoffeeLabel = new Label("블랙커피");
		labelPBlackCoffeeLabel.setBounds(2, 2, 95, 23);
		panelPremium.add(labelPBlackCoffeeLabel);
		labelPBlackCoffeeLabel.setAlignment(Label.CENTER);

		JLabel labelPricePBlackCoffee = new JLabel("$" + pricePBlackCoffee.getText());
		labelPricePBlackCoffee.setBackground(new Color(255, 255, 255));
		labelPricePBlackCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		labelPricePBlackCoffee.setBounds(1, 41, 95, 15);
		panelPremium.add(labelPricePBlackCoffee);

		btnPSugarCoffee.setBackground(Color.DARK_GRAY);
		btnPSugarCoffee.setForeground(new Color(255, 51, 51));
		btnPSugarCoffee.setBounds(96, 57, 95, 15);
		panelPremium.add(btnPSugarCoffee);

		Label labelPSugarCoffeeLabel = new Label("설탕커피");
		labelPSugarCoffeeLabel.setBounds(100, 2, 95, 23);
		panelPremium.add(labelPSugarCoffeeLabel);
		labelPSugarCoffeeLabel.setAlignment(Label.CENTER);

		JLabel labelPricePSugarCoffeeJLabel = new JLabel("$" + pricePSugarCreamCoffee.getText());
		labelPricePSugarCoffeeJLabel.setBackground(new Color(255, 255, 255));
		labelPricePSugarCoffeeJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labelPricePSugarCoffeeJLabel.setBounds(97, 41, 95, 15);
		panelPremium.add(labelPricePSugarCoffeeJLabel);

		btnPSugarCreamCoffee.setBackground(Color.DARK_GRAY);
		btnPSugarCreamCoffee.setForeground(new Color(255, 51, 51));
		btnPSugarCreamCoffee.setBounds(191, 57, 95, 15);
		panelPremium.add(btnPSugarCreamCoffee);

		Label labelPSugarCreamCoffeeLabel = new Label("설탕크림커피");
		labelPSugarCreamCoffeeLabel.setBounds(196, 2, 85, 23);
		panelPremium.add(labelPSugarCreamCoffeeLabel);
		labelPSugarCreamCoffeeLabel.setAlignment(Label.CENTER);

		JLabel labelPricePSugarCreamCoffeeJLabel = new JLabel("$" + pricePSugarCreamCoffee.getText());
		labelPricePSugarCreamCoffeeJLabel.setBackground(new Color(255, 255, 255));
		labelPricePSugarCreamCoffeeJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labelPricePSugarCreamCoffeeJLabel.setBounds(193, 41, 95, 15);
		panelPremium.add(labelPricePSugarCreamCoffeeJLabel);

		btnPBlackCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnPBlackCoffee.getText() == "O" && readyLight1.getText().equals("o")
						&& AlertLED.getText().equals("판매중")) {
					Controller.requestProduct("PBlackCoffee");
				}
			}
		});

		btnPSugarCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnPSugarCoffee.getText() == "O" && readyLight1.getText().equals("o")
						&& AlertLED.getText().equals("판매중")) {
					Controller.requestProduct("PSugarCoffee");
				}
			}
		});

		btnPSugarCreamCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnPSugarCreamCoffee.getText() == "O" && readyLight1.getText().equals("o")
						&& AlertLED.getText().equals("판매중")) {
					Controller.requestProduct("PSugarCreamCoffee");
				}
			}
		});

		panelPremium.repaint();

		/************ N Coffee *****************/

		JLabel labelNormalCoffee = new JLabel("일반커피");
		labelNormalCoffee.setHorizontalAlignment(SwingConstants.LEFT);
		labelNormalCoffee.setBounds(18, 98, 57, 15);
		whiteJPanel.add(labelNormalCoffee);

		JPanel panelNormal = new JPanel();
		panelNormal.setBackground(new Color(204, 204, 255));
		panelNormal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		whiteJPanel.add(panelNormal);
		panelNormal.setBounds(8, 115, 287, 72);
		panelNormal.setLayout(null);

		btnNBlackCoffee.setBackground(Color.DARK_GRAY);
		btnNBlackCoffee.setForeground(new Color(255, 51, 51));
		btnNBlackCoffee.setBounds(1, 57, 95, 15);
		panelNormal.add(btnNBlackCoffee);

		Label labelNBlackCoffeeLabel = new Label("블랙커피");
		labelNBlackCoffeeLabel.setBounds(2, 2, 95, 23);
		panelNormal.add(labelNBlackCoffeeLabel);
		labelNBlackCoffeeLabel.setAlignment(Label.CENTER);

		JLabel labelPriceNBlackCoffeeJLabel = new JLabel("$" + priceNBlackCoffee.getText());
		labelPriceNBlackCoffeeJLabel.setBackground(new Color(255, 255, 255));
		labelPriceNBlackCoffeeJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labelPriceNBlackCoffeeJLabel.setBounds(1, 41, 95, 15);
		panelNormal.add(labelPriceNBlackCoffeeJLabel);

		btnNSugarCoffee.setBackground(Color.DARK_GRAY);
		btnNSugarCoffee.setForeground(new Color(255, 51, 51));
		btnNSugarCoffee.setBounds(96, 57, 95, 15);
		panelNormal.add(btnNSugarCoffee);

		Label labelNSugarCoffeeLabel = new Label("설탕커피");
		labelNSugarCoffeeLabel.setBounds(100, 2, 95, 23);
		panelNormal.add(labelNSugarCoffeeLabel);
		labelNSugarCoffeeLabel.setAlignment(Label.CENTER);

		JLabel labelPriceNSugarCoffeeJLabel = new JLabel("$" + priceNSugarCoffee.getText());
		labelPriceNSugarCoffeeJLabel.setBackground(new Color(255, 255, 255));
		labelPriceNSugarCoffeeJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labelPriceNSugarCoffeeJLabel.setBounds(97, 41, 95, 15);
		panelNormal.add(labelPriceNSugarCoffeeJLabel);

		btnNSugarCreamCoffee.setBackground(Color.DARK_GRAY);
		btnNSugarCreamCoffee.setForeground(new Color(255, 51, 51));
		btnNSugarCreamCoffee.setBounds(191, 57, 95, 15);
		panelNormal.add(btnNSugarCreamCoffee);

		Label labelNSugarCreamCoffeeLabel = new Label("설탕크림커피");
		labelNSugarCreamCoffeeLabel.setBounds(196, 2, 85, 23);
		panelNormal.add(labelNSugarCreamCoffeeLabel);
		labelNSugarCreamCoffeeLabel.setAlignment(Label.CENTER);

		JLabel labelPriceNSugarCreamCoffeeJLabel = new JLabel("$" + priceNSugarCreamCoffee.getText());
		labelPriceNSugarCreamCoffeeJLabel.setBackground(new Color(255, 255, 255));
		labelPriceNSugarCreamCoffeeJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labelPriceNSugarCreamCoffeeJLabel.setBounds(193, 41, 95, 15);
		panelNormal.add(labelPriceNSugarCreamCoffeeJLabel);

		btnNBlackCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnNBlackCoffee.getText() == "O" && readyLight1.getText().equals("o")
						&& AlertLED.getText().equals("판매중")) {
					Controller.requestProduct("NBlackCoffee");
				}
			}
		});

		btnNSugarCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnNSugarCoffee.getText() == "O" && readyLight1.getText().equals("o")
						&& AlertLED.getText().equals("판매중")) {
					Controller.requestProduct("NSugarCoffee");
				}
			}
		});

		btnNSugarCreamCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnNSugarCreamCoffee.getText() == "O" && readyLight1.getText().equals("o")
						&& AlertLED.getText().equals("판매중")) {
					Controller.requestProduct("NSugarCreamCoffee");
				}
			}
		});

		panelNormal.repaint();

		/************ Woori Coffee *****************/
				  
		  JLabel labelWooriCoffee = new JLabel("우리차");
		  labelWooriCoffee.setHorizontalAlignment(SwingConstants.LEFT);
		  labelWooriCoffee.setBounds(18, 192, 57, 20);
		  whiteJPanel.add(labelWooriCoffee);
		  
		  JPanel panelWoori = new JPanel(); 
		  panelWoori.setBackground(new Color(204, 204, 255)); 
		  panelWoori.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null)); 
		  whiteJPanel.add(panelWoori); 
		  panelWoori.setBounds(8, 208, 287, 72); panelWoori.setLayout(null);
		  
		  btnYulmu.setBackground(Color.DARK_GRAY); 
		  btnYulmu.setForeground(new Color(255, 51, 51)); btnYulmu.setBounds(1, 57, 95, 15);
		  panelWoori.add(btnYulmu);
		  
		  Label labelYulmuLabel = new Label("율무차"); 
		  labelYulmuLabel.setBounds(2, 2, 95, 23);
		  panelWoori.add(labelYulmuLabel);
		  labelYulmuLabel.setAlignment(Label.CENTER);
		  
		  JLabel labelPriceYulmuJLabel = new JLabel("$" + priceYulmu.getText());
		  labelPriceYulmuJLabel.setBackground(new Color(255, 255, 255));
		  labelPriceYulmuJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		  labelPriceYulmuJLabel.setBounds(1, 41, 95, 15);
		  panelWoori.add(labelPriceYulmuJLabel);
		  
		  btnBlackTea.setBackground(Color.DARK_GRAY); 
		  btnBlackTea.setForeground(new Color(255, 51, 51)); 
		  btnBlackTea.setBounds(96, 57, 95, 15);
		  panelWoori.add(btnBlackTea);
		  
		  Label labelBlackTeaLabel = new Label("홍차"); 
		  labelBlackTeaLabel.setBounds(100, 2, 95, 23); 
		  panelWoori.add(labelBlackTeaLabel);
		  labelBlackTeaLabel.setAlignment(Label.CENTER);
		  
		  JLabel labelPriceBlackTeaJLabel = new JLabel("$" + priceBlackTea.getText());
		  labelPriceBlackTeaJLabel.setBackground(new Color(255, 255, 255));
		  labelPriceBlackTeaJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		  labelPriceBlackTeaJLabel.setBounds(97, 41, 95, 15);
		  panelWoori.add(labelPriceBlackTeaJLabel);
		  
		  btnCocoa.setBackground(Color.DARK_GRAY); 
		  btnCocoa.setForeground(new Color(255, 51, 51)); 
		  btnCocoa.setBounds(191, 57, 95, 15);
		  panelWoori.add(btnCocoa);
		  
		  Label labelCocoaLabel = new Label("코코아"); 
		  labelCocoaLabel.setBounds(196, 2, 85, 23); 
		  panelWoori.add(labelCocoaLabel);
		  labelCocoaLabel.setAlignment(Label.CENTER);
		  
		  JLabel labelPriceCocoaJLabel = new JLabel("$" + priceCocoa.getText());
		  labelPriceCocoaJLabel.setBackground(new Color(255, 255, 255));
		  labelPriceCocoaJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		  labelPriceCocoaJLabel.setBounds(193, 41, 95, 15);
		  panelWoori.add(labelPriceCocoaJLabel);
		  
		  btnYulmu.addActionListener(new ActionListener() {
			  @Override 
			  public void actionPerformed(ActionEvent e) { 
				  if (btnYulmu.getText() == "O" && readyLight1.getText().equals("o") &&
						  AlertLED.getText().equals("판매중")) { 
					  Controller.requestProduct("Yulmu"); 
				  } 
			  }
		  });
		  
		  btnBlackTea.addActionListener(new ActionListener() {
			  @Override 
			  public void actionPerformed(ActionEvent e) { 
				  if (btnBlackTea.getText() == "O" && readyLight1.getText().equals("o") &&
						  AlertLED.getText().equals("판매중")) { 
					  Controller.requestProduct("BlackTea"); 
				  }
			  } 
		  });
		  
		  btnCocoa.addActionListener(new ActionListener() {
			  @Override 
			  public void actionPerformed(ActionEvent e) { 
				  if (btnCocoa.getText() == "O" && readyLight1.getText().equals("o") &&
						  AlertLED.getText().equals("판매중")) { 
					  Controller.requestProduct("Cocoa"); 
				  } 
			  }
		  });
		 
		  panelWoori.repaint();
		  
		  /***********  Ready Light  *************/

		  readyLight1.setBackground(new Color(255, 255, 255));
		  readyLight1.setForeground(new Color(255, 200, 51));
		  readyLight1.setHorizontalAlignment(SwingConstants.CENTER);
		  readyLight1.setBounds(120, 300, 20, 20);
		  whiteJPanel.add(readyLight1);

		  readyLight2.setBackground(new Color(255, 255, 255));
		  readyLight2.setForeground(new Color(255, 200, 51));
		  readyLight2.setHorizontalAlignment(SwingConstants.CENTER);
		  readyLight2.setBounds(140, 300, 20, 20);
		  whiteJPanel.add(readyLight2);

		  readyLight3.setBackground(new Color(255, 255, 255));
		  readyLight3.setForeground(new Color(255, 200, 51));
		  readyLight3.setHorizontalAlignment(SwingConstants.CENTER);
		  readyLight3.setBounds(160, 300, 20, 20);
		  whiteJPanel.add(readyLight3);


		  /***********  Show Empty or Filled Cup  *************/
			
		  ImageIcon imageIcon = new ImageIcon(new ImageIcon("emptyCoffee.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		  JLabel label = new JLabel();
		  label.setIcon(imageIcon);
		  label.setLocation(40, 280);
		  label.setSize(200, 200);
		  label.setVisible(true);
		  whiteJPanel.add(label);		  
		  whiteJPanel.repaint();	
		  
		  
		  /***********  Show Input Price Money LED *************/
		  darkGrayJPanel.add(moneyLED);
		  moneyLED.setBackground(new Color(255, 255, 255));
		  moneyLED.setLocation(320, 70);
		  moneyLED.setSize(170, 45);
		  moneyLED.setVisible(true);
		  
		  /****************** MoneyManager에서 calculateTotalInput 가져오기 나중에 수정 */
		  moneyLED.setText("600\n판매중");

		  /***********  Show Water Temperature *************/
		  JLabel tempLabel = new JLabel("물 온도");
		  tempLabel.setForeground(new Color(255, 255, 255));
		  tempLabel.setLocation(320, 150);
		  tempLabel.setSize(170, 45);
		  tempLabel.setVisible(true);

		  darkGrayJPanel.add(tempLabel);
		  darkGrayJPanel.add(waterTempLED); 

		  waterTempLED.setBackground(new Color(255, 255, 255));
		  waterTempLED.setLocation(370, 160);
		  waterTempLED.setSize(100, 20);
		  waterTempLED.setVisible(true);
		  darkGrayJPanel.repaint();	
		  
		  /*************** Admin Button ***************/
		  btnApplyAdmin.setBackground(Color.DARK_GRAY); 
		  btnApplyAdmin.setForeground(new Color(255, 255, 255)); 
		  btnApplyAdmin.setBounds(420, 430, 60, 20);
		  darkGrayJPanel.add(btnApplyAdmin);
		  
		  btnApplyAdmin.addActionListener(new ActionListener() {
			  @Override 
			  public void actionPerformed(ActionEvent e) { 
				  darkGrayJPanel.setVisible(false);
				  
				  JPanel darkGrayPWJPanel = new JPanel();		
				  darkGrayPWJPanel.setBackground(new Color(80, 80, 80));
				  panelWrapper.add(darkGrayPWJPanel);
				  darkGrayPWJPanel.setBounds(0, 0, 500, 500);
				  darkGrayPWJPanel.setLayout(null);
					
				  JPanel whitePWJPanel = new JPanel();		
				  whitePWJPanel.setBackground(new Color(255, 255, 255));
				  darkGrayPWJPanel.add(whitePWJPanel);
				  whitePWJPanel.setBounds(10, 10, 300, 440);
				  whitePWJPanel.setLayout(null);
				  
				  JTextPane passwordLEDJTextPane = new JTextPane();
				  passwordLEDJTextPane.setBackground(new Color(255, 255, 255));
				  passwordLEDJTextPane.setLocation(320, 70);
				  passwordLEDJTextPane.setSize(170, 45);
				  passwordLEDJTextPane.setVisible(true);
				  darkGrayPWJPanel.add(passwordLEDJTextPane);
				  
				  JPanel passwordPanel = new JPanel();
				  passwordPanel.setLayout(new GridLayout(4, 3, 2, 2));
				  passwordPanel.setBackground(new Color(255, 255, 255));
				  passwordPanel.setLocation(320, 150);
				  passwordPanel.setSize(170, 200);
				  
				  String passwordButtonArr[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
				  
				  for (int i = 0; i < 12; i++) {
					  JButton numButton = new JButton(passwordButtonArr[i]);
					  passwordPanel.add(numButton);				  
					  
					  numButton.addActionListener(new ActionListener() {
						  @Override 
						  public void actionPerformed(ActionEvent e) {
							  String prevText = passwordLEDJTextPane.getText();
							  passwordLEDJTextPane.setText(prevText + numButton.getText());
						  }
					  });
				  }

				  darkGrayPWJPanel.add(passwordPanel);
					  
				  JButton openBtn = new JButton("열기");		  
				  openBtn.setBackground(Color.DARK_GRAY); 
				  openBtn.setForeground(new Color(255, 255, 255)); 
				  openBtn.setBounds(340, 430, 60, 20);
				  darkGrayPWJPanel.add(openBtn);

				  openBtn.addActionListener(new ActionListener() {
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  if (passwordLEDJTextPane.getText().equals(password)) {
							  darkGrayPWJPanel.setVisible(false);
							  
							  JPanel darkGrayControlJPanel = new JPanel();		
							  darkGrayControlJPanel.setBackground(new Color(80, 80, 80));
							  panelWrapper.add(darkGrayControlJPanel);
							  darkGrayControlJPanel.setBounds(0, 0, 500, 500);
							  darkGrayControlJPanel.setLayout(null);
							  
							  JPanel whiteControlJPanel = new JPanel();		
							  whiteControlJPanel.setBackground(new Color(255, 255, 255));
							  darkGrayControlJPanel.add(whiteControlJPanel);
							  whiteControlJPanel.setBounds(10, 10, 300, 440);
							  whiteControlJPanel.setLayout(null);
							  
							  /************ Have to Add Grid Layout 12 X 3 ************/
							  
							  JLabel waterMaxTempJLabel = new JLabel("물 최대 온도(℃)");
							  waterMaxTempJLabel.setForeground(new Color(255, 255, 255));
							  waterMaxTempJLabel.setLocation(320, 30);
							  waterMaxTempJLabel.setSize(170, 25);
							  waterMaxTempJLabel.setVisible(true);
							  darkGrayControlJPanel.add(waterMaxTempJLabel); 

							  JTextField waterMaxTempJTextField = new JTextField();
							  waterMaxTempJTextField.setForeground(new Color(0, 0, 0));
							  waterMaxTempJTextField.setLocation(320, 50);
							  waterMaxTempJTextField.setSize(170, 25);
							  waterMaxTempJTextField.setVisible(true);
							  darkGrayControlJPanel.add(waterMaxTempJTextField); 

							  JLabel waterCupCountJLabel = new JLabel("컵 개수");
							  waterCupCountJLabel.setForeground(new Color(255, 255, 255));
							  waterCupCountJLabel.setLocation(320, 90);
							  waterCupCountJLabel.setSize(170, 25);
							  waterCupCountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(waterCupCountJLabel); 
							  
							  cupCount.setLocation(320, 110);
							  cupCount.setSize(170, 25);
							  cupCount.setVisible(true);
							  cupCount.setValue(CupManager.CupCount);
							  darkGrayControlJPanel.add(cupCount); 

							  JLabel totalCountJLabel = new JLabel("TOTAL");
							  totalCountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  totalCountJLabel.setForeground(new Color(255, 255, 255));
							  totalCountJLabel.setLocation(320, 170);
							  totalCountJLabel.setSize(60, 25);
							  totalCountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(totalCountJLabel); 
							  
							  JTextField totalCountJTextField = new JTextField();
							  totalCountJTextField.setHorizontalAlignment(SwingConstants.CENTER);
							  totalCountJTextField.setLocation(400, 170);
							  totalCountJTextField.setSize(90, 25);
							  totalCountJTextField.setVisible(true);
							  darkGrayControlJPanel.add(totalCountJTextField); 

							  JLabel p1000CountJLabel = new JLabel("1000원");
							  p1000CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p1000CountJLabel.setForeground(new Color(255, 255, 255));
							  p1000CountJLabel.setLocation(320, 200);
							  p1000CountJLabel.setSize(60, 25);
							  p1000CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p1000CountJLabel); 

							  JTextField p1000CountJTextField = new JTextField();
							  p1000CountJTextField.setHorizontalAlignment(SwingConstants.CENTER);
							  p1000CountJTextField.setLocation(400, 200);
							  p1000CountJTextField.setSize(90, 25);
							  p1000CountJTextField.setVisible(true);
							  p1000CountJTextField.setText(Integer.toString(MoneyManager.getMoneyCount("1000")));
							  darkGrayControlJPanel.add(p1000CountJTextField); 


							  JLabel p500CountJLabel = new JLabel("500원");
							  p500CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p500CountJLabel.setForeground(new Color(255, 255, 255));
							  p500CountJLabel.setLocation(320, 230);
							  p500CountJLabel.setSize(60, 25);
							  p500CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p500CountJLabel); 

							  JTextField p500CountJTextField = new JTextField();
							  p500CountJTextField.setHorizontalAlignment(SwingConstants.CENTER);
							  p500CountJTextField.setLocation(400, 230);
							  p500CountJTextField.setSize(90, 25);
							  p500CountJTextField.setVisible(true);
							  p500CountJTextField.setText(Integer.toString(MoneyManager.getMoneyCount("500")));
							  darkGrayControlJPanel.add(p500CountJTextField); 


							  JLabel p100CountJLabel = new JLabel("100원");
							  p100CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p100CountJLabel.setForeground(new Color(255, 255, 255));
							  p100CountJLabel.setLocation(320, 260);
							  p100CountJLabel.setSize(60, 25);
							  p100CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p100CountJLabel); 

							  JTextField p100CountJTextField = new JTextField();
							  p100CountJTextField.setHorizontalAlignment(SwingConstants.CENTER);
							  p100CountJTextField.setLocation(400, 260);
							  p100CountJTextField.setSize(90, 25);
							  p100CountJTextField.setVisible(true);
							  p100CountJTextField.setText(Integer.toString(MoneyManager.getMoneyCount("100")));
							  darkGrayControlJPanel.add(p100CountJTextField); 


							  JLabel p10CountJLabel = new JLabel("10원");
							  p10CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p10CountJLabel.setForeground(new Color(255, 255, 255));
							  p10CountJLabel.setLocation(320, 290);
							  p10CountJLabel.setSize(60, 25);
							  p10CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p10CountJLabel); 

							  JTextField p10CountJTextField = new JTextField();
							  p10CountJTextField.setHorizontalAlignment(SwingConstants.CENTER);
							  p10CountJTextField.setLocation(400, 290);
							  p10CountJTextField.setSize(90, 25);
							  p10CountJTextField.setVisible(true);
							  p10CountJTextField.setText(Integer.toString(MoneyManager.getMoneyCount("10")));
							  darkGrayControlJPanel.add(p10CountJTextField); 

							  
							  JButton controlAdminApplyBtn = new JButton("적용");		  
							  controlAdminApplyBtn.setBackground(Color.DARK_GRAY); 
							  controlAdminApplyBtn.setForeground(new Color(255, 255, 255)); 
							  controlAdminApplyBtn.setBounds(340, 430, 60, 20);
							  darkGrayControlJPanel.add(controlAdminApplyBtn);
							  
							  controlAdminApplyBtn.addActionListener(new ActionListener() {
								  @Override
								  public void actionPerformed(ActionEvent e) {
									  
								  }
							  });
							  
							  JButton controlAdminCloseBtn = new JButton("잠금");
							  controlAdminCloseBtn.setBackground(Color.DARK_GRAY); 
							  controlAdminCloseBtn.setForeground(new Color(255, 255, 255)); 
							  controlAdminCloseBtn.setBounds(420, 430, 60, 20);
							  darkGrayControlJPanel.add(controlAdminCloseBtn);

							  controlAdminCloseBtn.addActionListener(new ActionListener() {
								  @Override
								  public void actionPerformed(ActionEvent e) {
									  darkGrayControlJPanel.setVisible(false);
									  darkGrayJPanel.setVisible(true);
								  }
							  });
						  }
						  
						  else {
							  passwordLEDJTextPane.setText("");
						  }
					  }
				  });
				  
				  JButton closeBtn = new JButton("닫기");
				  closeBtn.setBackground(Color.DARK_GRAY); 
				  closeBtn.setForeground(new Color(255, 255, 255)); 
				  closeBtn.setBounds(420, 430, 60, 20);
				  darkGrayPWJPanel.add(closeBtn);
				  
				  closeBtn.addActionListener(new ActionListener() {
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  darkGrayPWJPanel.setVisible(false);
						  darkGrayJPanel.setVisible(true);
					  }
				  });
			  }
		  });
	}
	
	
	public JTextPane moneyLED = new JTextPane();
	public static JTextPane AlertLED = new JTextPane();
	public JButton btnChange = new JButton();
	public JButton changeOut = new JButton();
	public JTextField waterTempLED = new JTextField(Integer.toString(TemperatureSensor.getWaterTemperature()));
	public static JLabel readyLight1 = new JLabel("●");
	public static JLabel readyLight2 = new JLabel("●");
	public static JLabel readyLight3 = new JLabel("●");
	
	public JPanel panelProductExit = new JPanel();
	public static JButton Product = new JButton();
	
	public static ImageIcon cup = new ImageIcon("emptyCoffee.jpg");
	public static ImageIcon coffee = new ImageIcon("filledCoffee.png");
	
	public JButton btn1000 = new JButton();
	public JButton btn500 = new JButton();
	public JButton btn100 = new JButton();
	public JButton btn50 = new JButton();
	public JButton btn10 = new JButton();
	public JButton btnInvalidMoney = new JButton();
	
	public JButton lock_in = new JButton();
	public JButton lock_out = new JButton();
	public JButton lock_out2 = new JButton();
	
	public JTextField countPCoffee = new JTextField();
	public JTextField countNCoffee = new JTextField();
	public JTextField countCream = new JTextField();
	public JTextField countSugar = new JTextField();
	public JTextField countYulmu = new JTextField();
	public JTextField countBlackTea = new JTextField();
	public JTextField countCocoa = new JTextField();
	public JTextField countTotal = new JTextField();
	
	public JButton count1000 = new JButton();
	public JTextField count500 = new JTextField();
	public JTextField count100 = new JTextField();
	public JTextField count50 = new JTextField();
	public JTextField count10 = new JTextField();
	
	public static JSpinner cupCount = new JSpinner();
	
	public JTextField pricePBlackCoffee = new JTextField("400", 10);
	public JTextField priceNBlackCoffee = new JTextField("300", 10);
	public JTextField priceYulmu = new JTextField("300");
	public JTextField priceBlackTea = new JTextField("300");
	public JTextField priceCocoa = new JTextField("300");
	public JTextField pricePSugarCoffee = new JTextField("400");
	public JTextField pricePSugarCreamCoffee = new JTextField("400");
	public JTextField priceNSugarCoffee = new JTextField("300");
	public JTextField priceNSugarCreamCoffee = new JTextField("300");
	
	public JTextField waterTempSet = new JTextField("96");
	
	public JButton btnApplyAdmin = new JButton("열쇠");
	
	private JButton btnPBlackCoffee = new JButton("O");
	private JButton btnPSugarCoffee = new JButton("O");
	private JButton btnPSugarCreamCoffee = new JButton("O");
	private JButton btnNBlackCoffee = new JButton("O");
	private JButton btnNSugarCoffee = new JButton("O");
	private JButton btnNSugarCreamCoffee = new JButton("O");
	private JButton btnYulmu = new JButton("O");
	private JButton btnBlackTea = new JButton("O");
	private JButton btnCocoa = new JButton("O");
	
	private String password = "1";
	private JTextField textareaPassword = new JTextField();
	private String passwordEntered = "";

	public void UserPanel() {
		// TODO implement here
	}

	public void acceptMoney(ActionEvent e) {
		// TODO implement here
	}

	public void showMoneyChangeExit(int value) {
		// TODO implement here
	}

	public static void showMoneyLED(int value) {
		// TODO implement here
	}

	public void showAvailableBtnLED(String selectAvailable) {
		// TODO implement here
	}

	public void showSoldOutBtnLED() {
		// TODO implement here
	}

	private void closeLock() {
		// TODO implement here
	}
	
	private void openLock() {
		// TODO implement here
	}

}