
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

	public UserPanel() {
		JFrame panelWrapper = new JFrame("Coffee Vending Machine");
		panelWrapper.setLayout(null);
		panelWrapper.setBackground(new Color(204, 204, 255));
		panelWrapper.setVisible(true);
		panelWrapper.setSize(700, 500);
		panelWrapper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		darkGrayJPanel.setBackground(new Color(80, 80, 80));
		panelWrapper.add(darkGrayJPanel);
		darkGrayJPanel.setBounds(0, 0, 500, 500);
		darkGrayJPanel.setLayout(null);
	
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

		JLabel labelPricePBlackCoffeeJLabel = new JLabel("$" + pricePBlackCoffee.getText());
		labelPricePBlackCoffeeJLabel.setBackground(new Color(255, 255, 255));
		labelPricePBlackCoffeeJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labelPricePBlackCoffeeJLabel.setBounds(1, 41, 95, 15);
		panelPremium.add(labelPricePBlackCoffeeJLabel);

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
				if(IngredientManager.countPCoffee<=0) {
					moneyLED.setText("고급블랙커피 재료부족");
				}
				else {
					if (btnPBlackCoffee.getText() == "O" && readyLight1.getText().equals("O")) {
						if(currentInput >= Integer.parseInt(pricePBlackCoffee.getText())) {
							currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(pricePBlackCoffee.getText()));

							if (MoneyManager.notEnoughChange()) {
								moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								currentInput += Integer.parseInt(pricePBlackCoffee.getText());
							}
							
							else {
								Controller.requestProduct("PBlackCoffee");
								moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								readyLight1.setText("●");
								btnPBlackCoffee.setText("●");
							}
						}
					}
				}	
			}
		});

		btnPSugarCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(IngredientManager.countPCoffee<=0||IngredientManager.countSugar<=0) {
					moneyLED.setText("고급설탕커피 재료부족");
				}
				else {
					if (btnPSugarCoffee.getText() == "O" && readyLight1.getText().equals("O")) {
						if(currentInput >= Integer.parseInt(pricePSugarCoffee.getText())) {
							currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(pricePSugarCoffee.getText()));
	
							if (MoneyManager.notEnoughChange()) {
								moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								currentInput += Integer.parseInt(pricePSugarCoffee.getText());
							}
							
							else {
								Controller.requestProduct("PSugarCoffee");
								moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								readyLight1.setText("●");
								btnPSugarCoffee.setText("●");
							}
						}
					}
				}	
			}
		});

		btnPSugarCreamCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(IngredientManager.countPCoffee<=0||IngredientManager.countSugar<=0
						||IngredientManager.countCream<=0) {
					moneyLED.setText("고급설탕크림커피 재료부족");
				}
				else {
					if (btnPSugarCreamCoffee.getText() == "O" && readyLight1.getText().equals("O")) {
						if(currentInput >= Integer.parseInt(pricePSugarCreamCoffee.getText())) {
							currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(pricePSugarCreamCoffee.getText()));
	
							if (MoneyManager.notEnoughChange()) {
								moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								currentInput += Integer.parseInt(pricePSugarCreamCoffee.getText());
							}
							
							else {
								Controller.requestProduct("PSugarCreamCoffee");
								moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								readyLight1.setText("●");
								btnPSugarCreamCoffee.setText("●");
							}
						}
					}
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
				if(IngredientManager.countNCoffee<=0) {
					moneyLED.setText("일반블랙커피 재료부족");
				}
				else {
					if (btnNBlackCoffee.getText() == "O" && readyLight1.getText().equals("O")) {
						if(currentInput >= Integer.parseInt(priceNBlackCoffee.getText())) {
							currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(priceNBlackCoffee.getText()));
	
							if (MoneyManager.notEnoughChange()) {
								moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								currentInput += Integer.parseInt(priceNBlackCoffee.getText());
							}
							
							else {
								Controller.requestProduct("NBlackCoffee");
								moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								readyLight1.setText("●");
								btnNBlackCoffee.setText("●");
							}
						}
					}
				}
			}
		});

		btnNSugarCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(IngredientManager.countNCoffee<=0||IngredientManager.countSugar<=0) {
					moneyLED.setText("일반설탕커피 재료부족");
				}
				else {
					if (btnNSugarCoffee.getText() == "O" && readyLight1.getText().equals("O")) {
						if(currentInput >= Integer.parseInt(priceNSugarCoffee.getText())) {
							currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(priceNSugarCoffee.getText()));
	
							if (MoneyManager.notEnoughChange()) {
								moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								currentInput += Integer.parseInt(priceNSugarCoffee.getText());
							}
							
							else {
								Controller.requestProduct("NSugarCoffee");
								moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								readyLight1.setText("●");
								btnNSugarCoffee.setText("●");
							}
						}
					}	
				}
			}
		});

		btnNSugarCreamCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(IngredientManager.countNCoffee<=0||IngredientManager.countSugar<=0
						||IngredientManager.countCream<=0) {
					moneyLED.setText("일반설탕크림커피 재료부족");
				}
				else {
					if (btnNSugarCreamCoffee.getText() == "O" && readyLight1.getText().equals("O")) {
						if(currentInput >= Integer.parseInt(priceNSugarCreamCoffee.getText())) {
							currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(priceNSugarCreamCoffee.getText()));
							
							if (MoneyManager.notEnoughChange()) {
								moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								currentInput += Integer.parseInt(priceNSugarCreamCoffee.getText());
							}
							
							else {
								Controller.requestProduct("NSugarCreamCoffee");
								moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								readyLight1.setText("●");
								btnNSugarCreamCoffee.setText("●");
							}
						}
					}	
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
				  if(IngredientManager.countYulmu<=0) {
						moneyLED.setText("율무차 재료부족");
				  }
				  
				  else {
					  if (btnYulmu.getText() == "O" && readyLight1.getText().equals("O")) {
						  if(currentInput >= Integer.parseInt(priceYulmu.getText())) {
							  currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(priceYulmu.getText()));
								
							  if (MoneyManager.notEnoughChange()) {
								  moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								  currentInput += Integer.parseInt(priceYulmu.getText());
							  }
								
							  else {
								  Controller.requestProduct("Yulmu");
								  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								  readyLight1.setText("●");
								  btnYulmu.setText("●");
							  }
						  }
					  }
				  }
			  }
		  });
		  
		  btnBlackTea.addActionListener(new ActionListener() {
			  @Override 
			  public void actionPerformed(ActionEvent e) { 
				  if(IngredientManager.countBlackTea<=0) {
						moneyLED.setText("홍차 재료부족");
					}
					else {
						if (btnBlackTea.getText() == "O" && readyLight1.getText().equals("O")) {
							if(currentInput >= Integer.parseInt(priceBlackTea.getText())) {
								  currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(priceBlackTea.getText()));
									
								  if (MoneyManager.notEnoughChange()) {
									  moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
									  currentInput += Integer.parseInt(priceBlackTea.getText());
								  }
									
								  else {
									  Controller.requestProduct("BlackTea");
									  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
									  readyLight1.setText("●");
									  btnBlackTea.setText("●");
								  }
							}
						}
					}
			  } 
		  });
		  
		  btnCocoa.addActionListener(new ActionListener() {
			  @Override 
			  public void actionPerformed(ActionEvent e) { 
				  if(IngredientManager.countCocoa<=0) {
						moneyLED.setText("코코아 재료부족");
				  }
				
				  else {
					  if (btnCocoa.getText() == "O" && readyLight1.getText().equals("O")) {
						  if(currentInput >= Integer.parseInt(priceCocoa.getText())) {
							  currentInput=MoneyManager.calculateChange(currentInput, Integer.parseInt(priceCocoa.getText()));
								
							  if (MoneyManager.notEnoughChange()) {
								  moneyLED.setText("잔돈 부족 \n판매자에 문의하세요.");
								  currentInput += Integer.parseInt(priceCocoa.getText());
							  }
								
							  else {
								  Controller.requestProduct("Cocoa");
								  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
								  readyLight1.setText("●");
								  btnCocoa.setText("●");
							  }
						  }
					  }
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
		  coffeeCupLabel.setIcon(imageIcon);
		  coffeeCupLabel.setLocation(40, 280);
		  coffeeCupLabel.setSize(200, 200);
		  coffeeCupLabel.setVisible(true);
		  whiteJPanel.add(coffeeCupLabel);		  
		  whiteJPanel.repaint();	
		  
		  /***********  Show Input Price Money LED *************/
		  darkGrayJPanel.add(moneyLED);
		  moneyLED.setBackground(new Color(255, 255, 255));
		  moneyLED.setLocation(320, 70);
		  moneyLED.setSize(170, 45);
		  moneyLED.setVisible(true);
		  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");

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

		  System.out.println("요청을 기다리는 중 ...");
		  
		  /*************** Admin Button ***************/
		  btnApplyAdmin.setBackground(Color.DARK_GRAY); 
		  btnApplyAdmin.setForeground(new Color(255, 255, 255)); 
		  btnApplyAdmin.setBounds(420, 430, 60, 20);
		  darkGrayJPanel.add(btnApplyAdmin);
		  
		  btnApplyAdmin.addActionListener(new ActionListener() {
			  @Override 
			  public void actionPerformed(ActionEvent e) { 
				  System.out.println("================================================");
				  System.out.println("관리자 모드로 변경하려면 비밀번호를 입력하세요.");
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

				  /*************** Password Panel ***************/
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

				  /*************** Control Panel ***************/
				  openBtn.addActionListener(new ActionListener() {
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  if (passwordLEDJTextPane.getText().equals(password)) {
							  System.out.println("관리자 모드 진입!");
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
							  
							  /************ Left Control Panel ************/
							  
							  JLabel leftControlIngAmountJLabel = new JLabel("재료양");
							  leftControlIngAmountJLabel.setLocation(120, 10);
							  leftControlIngAmountJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlIngAmountJLabel); 

							  JLabel leftControlPriceJLabel = new JLabel("가격");
							  leftControlPriceJLabel.setLocation(225, 10);
							  leftControlPriceJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlPriceJLabel); 

							  /************ Left Control Panel P Coffee ************/
							  JLabel leftControlPCoffeeJLabel = new JLabel("고급커피");
							  leftControlPCoffeeJLabel.setLocation(20, 40);
							  leftControlPCoffeeJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlPCoffeeJLabel); 

							  countPCoffee.setLocation(100, 40);
							  countPCoffee.setSize(80, 20);
							  countPCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  countPCoffee.setText(Integer.toString(IngredientManager.countPCoffee));
							  whiteControlJPanel.add(countPCoffee); 
							  
							  pricePBlackCoffee.setLocation(200, 40);
							  pricePBlackCoffee.setSize(80, 20);
							  pricePBlackCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(pricePBlackCoffee); 
							  
							  JLabel leftControlPSugarCoffeeJLabel = new JLabel("고급설탕커피");
							  leftControlPSugarCoffeeJLabel.setLocation(55, 70);
							  leftControlPSugarCoffeeJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlPSugarCoffeeJLabel); 
							  
							  pricePSugarCoffee.setLocation(200, 70);
							  pricePSugarCoffee.setSize(80, 20);
							  pricePSugarCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(pricePSugarCoffee); 
							  
							  JLabel leftControlPSugarCreamCoffeeJLabel = new JLabel("고급설탕크림커피");
							  leftControlPSugarCreamCoffeeJLabel.setLocation(45, 100);
							  leftControlPSugarCreamCoffeeJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlPSugarCreamCoffeeJLabel); 
							  
							  pricePSugarCreamCoffee.setLocation(200, 100);
							  pricePSugarCreamCoffee.setSize(80, 20);
							  pricePSugarCreamCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(pricePSugarCreamCoffee); 

							  /************ Left Control Panel N Coffee ************/
							  JLabel leftControlNCoffeeJLabel = new JLabel("일반커피");
							  leftControlNCoffeeJLabel.setLocation(20, 130);
							  leftControlNCoffeeJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlNCoffeeJLabel); 

							  countNCoffee.setLocation(100, 130);
							  countNCoffee.setSize(80, 20);
							  countNCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  countNCoffee.setText(Integer.toString(IngredientManager.countNCoffee));
							  whiteControlJPanel.add(countNCoffee); 
							  
							  priceNBlackCoffee.setLocation(200, 130);
							  priceNBlackCoffee.setSize(80, 20);
							  priceNBlackCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(priceNBlackCoffee); 
							  
							  JLabel leftControlNSugarCoffeeJLabel = new JLabel("일반설탕커피");
							  leftControlNSugarCoffeeJLabel.setLocation(55, 160);
							  leftControlNSugarCoffeeJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlNSugarCoffeeJLabel); 
							  
							  priceNSugarCoffee.setLocation(200, 160);
							  priceNSugarCoffee.setSize(80, 20);
							  priceNSugarCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(priceNSugarCoffee); 
							  
							  JLabel leftControlNSugarCreamCoffeeJLabel = new JLabel("일반설탕크림커피");
							  leftControlNSugarCreamCoffeeJLabel.setLocation(45, 190);
							  leftControlNSugarCreamCoffeeJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlNSugarCreamCoffeeJLabel); 
							  
							  priceNSugarCreamCoffee.setLocation(200, 190);
							  priceNSugarCreamCoffee.setSize(80, 20);
							  priceNSugarCreamCoffee.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(priceNSugarCreamCoffee); 

							  /************ Left Control Panel ETC ************/
							  JLabel leftControlCreamJLabel = new JLabel("크림");
							  leftControlCreamJLabel.setLocation(40, 220);
							  leftControlCreamJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlCreamJLabel); 
							  
							  countCream.setLocation(100, 220);
							  countCream.setSize(80, 20);
							  countCream.setHorizontalAlignment(SwingConstants.CENTER);
							  countCream.setText(Integer.toString(IngredientManager.countCream));
							  whiteControlJPanel.add(countCream);  

							  JLabel leftControlSugarJLabel = new JLabel("설탕");
							  leftControlSugarJLabel.setLocation(40, 250);
							  leftControlSugarJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlSugarJLabel); 
							  
							  countSugar.setLocation(100, 250);
							  countSugar.setSize(80, 20);
							  countSugar.setHorizontalAlignment(SwingConstants.CENTER);
							  countSugar.setText(Integer.toString(IngredientManager.countSugar));
							  whiteControlJPanel.add(countSugar);  

							  JLabel leftControlYulmuJLabel = new JLabel("율무차");
							  leftControlYulmuJLabel.setLocation(35, 280);
							  leftControlYulmuJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlYulmuJLabel); 
							  
							  countYulmu.setLocation(100, 280);
							  countYulmu.setSize(80, 20);
							  countYulmu.setHorizontalAlignment(SwingConstants.CENTER);
							  countYulmu.setText(Integer.toString(IngredientManager.countYulmu));
							  whiteControlJPanel.add(countYulmu);  
							  
							  priceYulmu.setLocation(200, 280);
							  priceYulmu.setSize(80, 20);
							  priceYulmu.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(priceYulmu); 

							  JLabel leftControlBlackTeaJLabel = new JLabel("홍차");
							  leftControlBlackTeaJLabel.setLocation(40, 310);
							  leftControlBlackTeaJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlBlackTeaJLabel); 
							  
							  countBlackTea.setLocation(100, 310);
							  countBlackTea.setSize(80, 20);
							  countBlackTea.setHorizontalAlignment(SwingConstants.CENTER);
							  countBlackTea.setText(Integer.toString(IngredientManager.countBlackTea));
							  whiteControlJPanel.add(countBlackTea);  
							  
							  priceBlackTea.setLocation(200, 310);
							  priceBlackTea.setSize(80, 20);
							  priceBlackTea.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(priceBlackTea); 


							  JLabel leftControlCocoaJLabel = new JLabel("코코아");
							  leftControlCocoaJLabel.setLocation(35, 340);
							  leftControlCocoaJLabel.setSize(170, 25);
							  whiteControlJPanel.add(leftControlCocoaJLabel); 
							  
							  countCocoa.setLocation(100, 340);
							  countCocoa.setSize(80, 20);
							  countCocoa.setHorizontalAlignment(SwingConstants.CENTER);
							  countCocoa.setText(Integer.toString(IngredientManager.countCocoa));
							  whiteControlJPanel.add(countCocoa);  
							  
							  priceCocoa.setLocation(200, 340);
							  priceCocoa.setSize(80, 20);
							  priceCocoa.setHorizontalAlignment(SwingConstants.CENTER);
							  whiteControlJPanel.add(priceCocoa); 
							  
							  /************ Right Control Panel ************/

							  /************ Water Max Temperature Controller ************/
							  JLabel waterMaxTempJLabel = new JLabel("물 최대 온도(℃)");
							  waterMaxTempJLabel.setForeground(new Color(255, 255, 255));
							  waterMaxTempJLabel.setLocation(320, 30);
							  waterMaxTempJLabel.setSize(170, 25);
							  waterMaxTempJLabel.setVisible(true);
							  darkGrayControlJPanel.add(waterMaxTempJLabel); 

							  JTextField waterMaxTempJTextField = new JTextField("98");
							  waterMaxTempJTextField.setForeground(new Color(0, 0, 0));
							  waterMaxTempJTextField.setLocation(320, 50);
							  waterMaxTempJTextField.setSize(170, 25);
							  waterMaxTempJTextField.setVisible(true);
							  darkGrayControlJPanel.add(waterMaxTempJTextField); 

							  /************ Cup Controller ************/
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

							  /************ Money Controller ************/
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
							  totalCountJTextField.setEnabled(false);
							  totalCountJTextField.setText(Integer.toString(MoneyManager.getCoinStackTotal()));
							  darkGrayControlJPanel.add(totalCountJTextField); 

							  JLabel p1000CountJLabel = new JLabel("1000원");
							  p1000CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p1000CountJLabel.setForeground(new Color(255, 255, 255));
							  p1000CountJLabel.setLocation(320, 200);
							  p1000CountJLabel.setSize(60, 25);
							  p1000CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p1000CountJLabel); 

							  count1000.setHorizontalAlignment(SwingConstants.CENTER);
							  count1000.setLocation(400, 200);
							  count1000.setSize(90, 25);
							  count1000.setVisible(true);
							  count1000.setText(Integer.toString(MoneyManager.getMoneyCount("1000")));
							  darkGrayControlJPanel.add(count1000); 

							  JLabel p500CountJLabel = new JLabel("500원");
							  p500CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p500CountJLabel.setForeground(new Color(255, 255, 255));
							  p500CountJLabel.setLocation(320, 230);
							  p500CountJLabel.setSize(60, 25);
							  p500CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p500CountJLabel); 

							  count500.setHorizontalAlignment(SwingConstants.CENTER);
							  count500.setLocation(400, 230);
							  count500.setSize(90, 25);
							  count500.setVisible(true);
							  count500.setText(Integer.toString(MoneyManager.getMoneyCount("500")));
							  darkGrayControlJPanel.add(count500); 

							  JLabel p100CountJLabel = new JLabel("100원");
							  p100CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p100CountJLabel.setForeground(new Color(255, 255, 255));
							  p100CountJLabel.setLocation(320, 260);
							  p100CountJLabel.setSize(60, 25);
							  p100CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p100CountJLabel); 

							  count100.setHorizontalAlignment(SwingConstants.CENTER);
							  count100.setLocation(400, 260);
							  count100.setSize(90, 25);
							  count100.setVisible(true);
							  count100.setText(Integer.toString(MoneyManager.getMoneyCount("100")));
							  darkGrayControlJPanel.add(count100); 

							  JLabel p50CountJLabel = new JLabel("50원");
							  p50CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p50CountJLabel.setForeground(new Color(255, 255, 255));
							  p50CountJLabel.setLocation(320, 290);
							  p50CountJLabel.setSize(60, 25);
							  p50CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p50CountJLabel); 

							  count50.setHorizontalAlignment(SwingConstants.CENTER);
							  count50.setLocation(400, 290);
							  count50.setSize(90, 25);
							  count50.setVisible(true);
							  count50.setText(Integer.toString(MoneyManager.getMoneyCount("50")));
							  darkGrayControlJPanel.add(count50); 

							  JLabel p10CountJLabel = new JLabel("10원");
							  p10CountJLabel.setHorizontalAlignment(SwingConstants.CENTER);
							  p10CountJLabel.setForeground(new Color(255, 255, 255));
							  p10CountJLabel.setLocation(320, 320);
							  p10CountJLabel.setSize(60, 25);
							  p10CountJLabel.setVisible(true);
							  darkGrayControlJPanel.add(p10CountJLabel); 

							  count10.setHorizontalAlignment(SwingConstants.CENTER);
							  count10.setLocation(400, 320);
							  count10.setSize(90, 25);
							  count10.setVisible(true);
							  count10.setText(Integer.toString(MoneyManager.getMoneyCount("10")));
							  darkGrayControlJPanel.add(count10); 

							  /************ Apply Button ************/
							  JButton controlAdminApplyBtn = new JButton("적용");		  
							  controlAdminApplyBtn.setBackground(Color.DARK_GRAY); 
							  controlAdminApplyBtn.setForeground(new Color(255, 255, 255)); 
							  controlAdminApplyBtn.setBounds(340, 430, 60, 20);
							  darkGrayControlJPanel.add(controlAdminApplyBtn);
							  
							  controlAdminApplyBtn.addActionListener(new ActionListener() {
								  @Override
								  public void actionPerformed(ActionEvent e) {
									  CupManager.CupCount = (int) cupCount.getValue();
									  
									  try {
										  IngredientManager.countPCoffee = Integer.parseInt(countPCoffee.getText());
										  pricePBlackCoffee.setText(pricePBlackCoffee.getText());
										  pricePSugarCoffee.setText(pricePSugarCoffee.getText());
										  pricePSugarCreamCoffee.setText(pricePSugarCreamCoffee.getText());

										  IngredientManager.countNCoffee = Integer.parseInt(countNCoffee.getText());
										  priceNBlackCoffee.setText(priceNBlackCoffee.getText());
										  priceNSugarCoffee.setText(priceNSugarCoffee.getText());
										  priceNSugarCreamCoffee.setText(priceNSugarCreamCoffee.getText());

										  IngredientManager.countCream = Integer.parseInt(countCream.getText());
										  IngredientManager.countSugar = Integer.parseInt(countSugar.getText());
										  
										  IngredientManager.countYulmu = Integer.parseInt(countYulmu.getText());
										  priceYulmu.setText(priceYulmu.getText());

										  IngredientManager.countBlackTea = Integer.parseInt(countBlackTea.getText());
										  priceBlackTea.setText(priceBlackTea.getText());

										  IngredientManager.countCocoa = Integer.parseInt(countCocoa.getText());
										  priceCocoa.setText(priceCocoa.getText());
										  
										  MoneyManager.count1000 = Integer.parseInt(count1000.getText());
										  MoneyManager.count500 = Integer.parseInt(count500.getText());
										  MoneyManager.count100 = Integer.parseInt(count100.getText());
										  MoneyManager.count50 = Integer.parseInt(count50.getText());
										  MoneyManager.count10 = Integer.parseInt(count10.getText());
										  
										  totalCountJTextField.setText(Integer.toString(MoneyManager.getCoinStackTotal()));
										  System.out.println("변경사항이 저장되었습니다.");
									  } 
									  
									  catch (NumberFormatException e2) {
										  System.out.println("Num Exception");
									  }
									  
									  showNoCup();
									  showNoIngredient();
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
									  System.out.println("================================================");									  System.out.println("관리자 모드로 변경하려면 비밀번호를 입력하세요.");
									  darkGrayControlJPanel.setVisible(false);
									  darkGrayJPanel.setVisible(true);

									  labelPricePBlackCoffeeJLabel.setText("$" + pricePBlackCoffee.getText());
									  labelPricePSugarCoffeeJLabel.setText("$" + pricePSugarCoffee.getText());
									  labelPricePSugarCreamCoffeeJLabel.setText("$" + pricePSugarCreamCoffee.getText());

									  labelPriceNBlackCoffeeJLabel.setText("$" + priceNBlackCoffee.getText());
									  labelPriceNSugarCoffeeJLabel.setText("$" + priceNSugarCoffee.getText());
									  labelPriceNSugarCreamCoffeeJLabel.setText("$" + priceNSugarCreamCoffee.getText());
									  
									  labelPriceYulmuJLabel.setText("$" + priceYulmu.getText());
									  labelPriceBlackTeaJLabel.setText("$" + priceBlackTea.getText());
									  labelPriceCocoaJLabel.setText("$" + priceCocoa.getText());
								  }
							  });
						  }
						  
						  else {
							  System.out.println("잘못된 비밀번호입니다. 다시 입력하세요.");
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
		  
		  /**********************My Wallet**************************/
		  
		  JPanel walletPanel = new JPanel();		
		  panelWrapper.add(walletPanel);
		  //walletPanel.setBackground(new Color(255,0,0));
		  walletPanel.setBounds(500, 0, 200, 500);
		  walletPanel.setLayout(null);

		  JLabel labelMyWallet = new JLabel("내 지갑");
		  labelMyWallet.setHorizontalAlignment(SwingConstants.CENTER);
		  labelMyWallet.setBounds(65, 50, 57, 14);
		  walletPanel.add(labelMyWallet);
		  
		  ImageIcon ic_1000won = new ImageIcon(new ImageIcon("won_1000.jpeg").getImage().getScaledInstance(80, 30, Image.SCALE_DEFAULT));
		  btn1000.setIcon(ic_1000won);
		  btn1000.setLocation(55, 80);
		  btn1000.setSize(80,30);
		  btn1000.setVisible(true);
		  walletPanel.add(btn1000);	
		  btn1000.addActionListener(new ActionListener() {
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  //currentInput+=1000;
						  currentInput=MoneyManager.calculateTotalInput(currentInput, 1000);
						  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
						  MoneyManager.count1000++;
					  }
				  });
		  
		  ImageIcon ic_500won = new ImageIcon(new ImageIcon("won_500.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		  btn500.setIcon(ic_500won);
		  btn500.setLocation(70, 120);
		  btn500.setSize(50,50);
		  btn500.setVisible(true);
		  walletPanel.add(btn500);
		  btn500.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  currentInput=MoneyManager.calculateTotalInput(currentInput, 500);
				  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
				  MoneyManager.count500++;
			  }
		  });
		  
		  ImageIcon ic_100won = new ImageIcon(new ImageIcon("won_100.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		  btn100.setIcon(ic_100won);
		  btn100.setLocation(70, 180);
		  btn100.setSize(50,50);
		  btn100.setVisible(true);
		  walletPanel.add(btn100);
		  btn100.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  currentInput=MoneyManager.calculateTotalInput(currentInput, 100);
				  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
				  MoneyManager.count100++;
			  }
		  });
		  
		  ImageIcon ic_50won = new ImageIcon(new ImageIcon("won_50.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		  btn50.setIcon(ic_50won);
		  btn50.setLocation(70, 240);
		  btn50.setSize(50,50);
		  btn50.setVisible(true);
		  walletPanel.add(btn50);
		  btn50.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  currentInput=MoneyManager.calculateTotalInput(currentInput, 50);
				  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
				  MoneyManager.count50++;
			  }
		  });
		  
		  ImageIcon ic_10won = new ImageIcon(new ImageIcon("won_10.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		  btn10.setIcon(ic_10won);
		  btn10.setLocation(70, 300);
		  btn10.setSize(50,50);
		  btn10.setVisible(true);
		  walletPanel.add(btn10);
		  btn10.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  currentInput=MoneyManager.calculateTotalInput(currentInput, 10);
				  moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
				  MoneyManager.count10++;
			  }
		  });

		  	  
		  walletPanel.repaint();

		  /**********************refresh button***************************/
		  
		  ImageIcon ic_refresh = new ImageIcon(new ImageIcon("refresh.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		  btnChange.setIcon(ic_refresh);
		  btnChange.setBackground(Color.LIGHT_GRAY);
		  btnChange.setLocation(380, 250);
		  btnChange.setSize(50,50);
		  btnChange.setVisible(true);
		  darkGrayJPanel.add(btnChange);	
		  btnChange.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  changeOut.setText(Integer.toString(currentInput));

				  if (currentInput / 1000 > 0 && currentInput / 1000 <= MoneyManager.count1000) {
					  MoneyManager.count1000--;
					  currentInput -= 1000;
				  }
					
				  if (currentInput / 500 > 0 && currentInput / 500 <= MoneyManager.count500) {
					  MoneyManager.count500--;
					  currentInput -= 500;
				  }
					
				  if (currentInput / 100 > 0 && currentInput / 100 <= MoneyManager.count100) {
					  MoneyManager.count100--;
					  currentInput -= 100;
				  }
					
				  if (currentInput / 50 > 0 && currentInput / 50 <= MoneyManager.count50) {
					  MoneyManager.count50--;
					  currentInput -= 50;
				  }
					
				  if (currentInput / 10 > 0 && currentInput / 10 <= MoneyManager.count10) {
					  MoneyManager.count10--;
					  currentInput -= 10;
				  }
				  
				  currentInput = 0;
				  moneyLED.setText(currentInput + "\n판매중");
			  }
		  });
		  
		  darkGrayJPanel.repaint();
		  
		  /**********************showChange button************************/
		  
		  changeOut.setText(Integer.toString(MoneyManager.calculateChange(0, 0)));
		  changeOut.setForeground(Color.WHITE);
		  changeOut.setBackground(Color.BLACK);
		  changeOut.setLocation(360, 320);
		  changeOut.setSize(90,50);
		  changeOut.setVisible(true);
		  darkGrayJPanel.add(changeOut);
		  darkGrayJPanel.repaint();
		  
		  /**************************if no cup*****************************/
		  showNoCup();
		  
		  /**************************if no ingredient**********************/
		  showNoIngredient();
	}
	
	public static int currentInput=0;
	
	public static JPanel whiteJPanel = new JPanel();
	public static JPanel darkGrayJPanel = new JPanel();
	
	public static JTextPane moneyLED = new JTextPane();
	public static JTextPane AlertLED = new JTextPane();
	public JButton btnChange = new JButton();
	public JButton changeOut = new JButton();
	public JTextField waterTempLED = new JTextField(Integer.toString(TemperatureSensor.getWaterTemperature()));
	public static JLabel readyLight1 = new JLabel("O");
	public static JLabel readyLight2 = new JLabel("O");
	public static JLabel readyLight3 = new JLabel("O");
	
	public JPanel panelProductExit = new JPanel();
	public static JButton Product = new JButton();
	
	public static ImageIcon cup = new ImageIcon("emptyCoffee.jpg");
	public static ImageIcon coffee = new ImageIcon("filledCoffee.png");
	public static JLabel coffeeCupLabel = new JLabel();
	
	public JButton btn1000 = new JButton();
	public JButton btn500 = new JButton();
	public JButton btn100 = new JButton();
	public JButton btn50 = new JButton();
	public JButton btn10 = new JButton();
	public JButton btnInvalidMoney = new JButton();
	
	public JButton lock_in = new JButton();
	public JButton lock_out = new JButton();
	public JButton lock_out2 = new JButton();
	
	public JTextField countPCoffee = new JTextField(Integer.toString(IngredientManager.countPCoffee));
	public JTextField countNCoffee = new JTextField(Integer.toString(IngredientManager.countNCoffee));
	public JTextField countCream = new JTextField(Integer.toString(IngredientManager.countCream));
	public JTextField countSugar = new JTextField(Integer.toString(IngredientManager.countSugar));
	public JTextField countYulmu = new JTextField(Integer.toString(IngredientManager.countYulmu));
	public JTextField countBlackTea = new JTextField(Integer.toString(IngredientManager.countBlackTea));
	public JTextField countCocoa = new JTextField(Integer.toString(IngredientManager.countCocoa));
	public JTextField countTotal = new JTextField();
	
	public JTextField count1000 = new JTextField(Integer.toString(MoneyManager.count1000));
	public JTextField count500 = new JTextField(Integer.toString(MoneyManager.count500));
	public JTextField count100 = new JTextField(Integer.toString(MoneyManager.count100));
	public JTextField count50 = new JTextField(Integer.toString(MoneyManager.count50));
	public JTextField count10 = new JTextField(Integer.toString(MoneyManager.count10));
	
	public static JSpinner cupCount = new JSpinner();
	
	public JTextField pricePBlackCoffee = new JTextField("400");
	public JTextField priceNBlackCoffee = new JTextField("300");
	public JTextField priceYulmu = new JTextField("300");
	public JTextField priceBlackTea = new JTextField("300");
	public JTextField priceCocoa = new JTextField("300");
	public JTextField pricePSugarCoffee = new JTextField("400");
	public JTextField pricePSugarCreamCoffee = new JTextField("400");
	public JTextField priceNSugarCoffee = new JTextField("300");
	public JTextField priceNSugarCreamCoffee = new JTextField("300");
	
	public JTextField waterTempSet = new JTextField("96");
	
	public JButton btnApplyAdmin = new JButton("열쇠");
	
	public static JButton btnPBlackCoffee = new JButton("O");
	public static JButton btnPSugarCoffee = new JButton("O");
	public static JButton btnPSugarCreamCoffee = new JButton("O");
	public static JButton btnNBlackCoffee = new JButton("O");
	public static JButton btnNSugarCoffee = new JButton("O");
	public static JButton btnNSugarCreamCoffee = new JButton("O");
	public static JButton btnYulmu = new JButton("O");
	public static JButton btnBlackTea = new JButton("O");
	public static JButton btnCocoa = new JButton("O");
	
	private String password = "1234";
	private JTextField textareaPassword = new JTextField();
	private String passwordEntered = "";
	
	public static boolean isCupAvailble = true;

	public void acceptMoney(ActionEvent e) { //nu
		// TODO implement here
		System.out.println("money accepted...");
	}

	public void showMoneyChangeExit(int value) { //nu
		// TODO implement here
		System.out.println("change: "+value);
	}

	public static void showMoneyLED(int value) { //nu
		// TODO implement here
		System.out.println("moneyLED: "+value);
	}

	public void showAvailableBtnLED(String selectAvailable) { //nu
		// TODO implement here
		System.out.println("AVAILABLE");
	}

	public void showSoldOutBtnLED() { //nu
		// TODO implement here
		System.out.println("SOLD OUT");
	}

	private void closeLock() { //nu
		// TODO implement here
		System.out.println("Lock close...");
	}
	
	private void openLock() { //nu
		// TODO implement here
		System.out.println("Lock open...");
	}
	
	public static void repaintCoffeeButton() {
		if(Controller.isRequestFinished==true) {
			btnPBlackCoffee.setText("O");
			btnPSugarCoffee.setText("O");
			btnPSugarCreamCoffee.setText("O");
			btnNBlackCoffee.setText("O");
			btnNSugarCoffee.setText("O");
			btnNSugarCreamCoffee.setText("O");
			btnYulmu.setText("O");
			btnBlackTea.setText("O");
			btnCocoa.setText("O");
			whiteJPanel.repaint();
		}
	}
	
	public static void showNoCup() {
		if(CupManager.getCupCount()==0) {
			isCupAvailble = false;
			moneyLED.setText("컵 부족");
			darkGrayJPanel.repaint();
		}
		
		else {
			isCupAvailble = true;
			moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
			darkGrayJPanel.repaint();
		}
	}
	
	public static void showNoIngredient() {
		if(Manufacture.hasIngredient==false) {
			moneyLED.setText("재료 부족");
			darkGrayJPanel.repaint();
		}
		
		else if (isCupAvailble) {
			moneyLED.setText(Integer.toString(currentInput)+"\n판매중");
			darkGrayJPanel.repaint();
		}
	}
}