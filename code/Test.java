����   ? f  Twisted/Test  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LTwisted/Test; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Enter any integer
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I
 , . - Twistes_Prime/PrimeNumber / 0 PrimeNumber (I)Z 2 java/lang/StringBuilder 4 Given number 
 1 6  &
 1 8 9 : append (I)Ljava/lang/StringBuilder; < IsPrime
 1 > 9 ? -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 1 A 9 B (Z)Ljava/lang/StringBuilder;
 1 D E F toString ()Ljava/lang/String;
 H J I Twisted/Reverse_Number K L Reverse_Number (I)I N Reverse of given number is  P Given Number  R is Twisted Prime T +Given number is prime but not twisted prime V !Given number is not twisted prime X given number is not prime args [Ljava/lang/String; sc Ljava/util/Scanner; num I isPrime Z rev StackMapTable Z 
SourceFile 	Test.java !               /     *� �    
                    	      _     �� Y� � L� � !+� '=� +>� � 1Y3� 5� 7;� =� @� C� !Y>� d� G6� � 1YM� 5� 7� C� !� +� !� � 1YO� 5� 7Q� =� C� !� )� +� � S� !� � U� !� � W� !�    
   J      	  
     <  B  H  _  g  �  �  �  �  �  �  �   � %    4    � Y Z    � [ \   � ] ^   � _ `  H X a ^  b    � �  c   � 
  d    e