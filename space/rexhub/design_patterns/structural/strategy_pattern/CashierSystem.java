package space.rexhub.design_patterns.structural.strategy_pattern;

import space.rexhub.design_patterns.structural.strategy_pattern.cash.CashContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Description: 收银系统
 *
 * @author Rex
 * @date 2025-01-09
 */
public class CashierSystem {
    public static void main(String[] args) {
        // 创建主框架
        JFrame frame = new JFrame("商场收银系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // 单价标签和文本框
        JLabel priceLabel = new JLabel("单价：");
        priceLabel.setBounds(50, 30, 50, 25);
        frame.add(priceLabel);

        JTextField priceField = new JTextField("0.00");
        priceField.setBounds(100, 30, 150, 25);
        frame.add(priceField);

        // 数量标签和文本框
        JLabel quantityLabel = new JLabel("数量：");
        quantityLabel.setBounds(50, 70, 50, 25);
        frame.add(quantityLabel);

        JTextField quantityField = new JTextField("0");
        quantityField.setBounds(100, 70, 150, 25);
        frame.add(quantityField);

        // 确定按钮
        JButton confirmButton = new JButton("确定");
        confirmButton.setBounds(270, 30, 80, 25);
        frame.add(confirmButton);

        // 重置按钮
        JButton resetButton = new JButton("重置");
        resetButton.setBounds(270, 70, 80, 25);
        frame.add(resetButton);

        // 显示商品列表的文本区域
        JTextArea itemList = new JTextArea();
        itemList.setBounds(50, 150, 300, 80);
        itemList.setEditable(false);
        frame.add(itemList);

        // 总计标签和显示区域
        JLabel totalLabel = new JLabel("总计：");
        totalLabel.setBounds(50, 240, 50, 25);
        frame.add(totalLabel);

        JLabel totalAmount = new JLabel("0.00");
        totalAmount.setBounds(100, 240, 150, 25);
        totalAmount.setFont(new Font("Serif", Font.BOLD, 18));
        frame.add(totalAmount);

        JLabel discountLabel = new JLabel("选择折扣：");
        discountLabel.setBounds(25, 110, 100, 25);
        frame.add(discountLabel);

        // 创建下拉框，可以选择折扣
        JComboBox<String> discountComboBox = new JComboBox<>(new String[]{"正常收费", "满300返100", "打8折"});
        discountComboBox.setBounds(100, 110, 150, 25);
        frame.add(discountComboBox);

// 确定按钮的动作监听器
        confirmButton.addActionListener(new ActionListener() {

            // 声明一个double变量total来计算总计
            double total = 0.0;

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String cashType = (String) discountComboBox.getSelectedItem();
                    CashContext cc = new CashContext(cashType);
                    // 声明一个double变量totalPrices来计算每个商品的单价(txtPrices) * 数量(txtNum)后的合计
                    double totalPrices = cc.getResult(Double.parseDouble(priceField.getText()) * Integer.parseInt(quantityField.getText()));
                    // 将每个商品合计计入总计
                    total = total + totalPrices;
                    // 更新商品列表
                    itemList.append(String.format("单价: %s, 数量: %s, 活动: %s, 小计: %.2f\n",
                            priceField.getText(), quantityField.getText(), cashType, totalPrices));
                    totalAmount.setText(String.format("%.2f", total));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "请输入有效的数字！", "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        // 重置按钮的动作监听器
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                priceField.setText("0.00");
                quantityField.setText("0");
                itemList.setText("");
                totalAmount.setText("0.00");
            }
        });

        // 显示框架
        frame.setVisible(true);
    }
}