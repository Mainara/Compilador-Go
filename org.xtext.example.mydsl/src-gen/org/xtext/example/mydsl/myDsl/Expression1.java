/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression1#getUnaryExpr <em>Unary Expr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression1#getExpression_Linha <em>Expression Linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression1()
 * @model
 * @generated
 */
public interface Expression1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Unary Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Expr</em>' containment reference.
   * @see #setUnaryExpr(UnaryExpr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression1_UnaryExpr()
   * @model containment="true"
   * @generated
   */
  UnaryExpr getUnaryExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expression1#getUnaryExpr <em>Unary Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Expr</em>' containment reference.
   * @see #getUnaryExpr()
   * @generated
   */
  void setUnaryExpr(UnaryExpr value);

  /**
   * Returns the value of the '<em><b>Expression Linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Linha</em>' containment reference.
   * @see #setExpression_Linha(Expression_Linha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression1_Expression_Linha()
   * @model containment="true"
   * @generated
   */
  Expression_Linha getExpression_Linha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expression1#getExpression_Linha <em>Expression Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Linha</em>' containment reference.
   * @see #getExpression_Linha()
   * @generated
   */
  void setExpression_Linha(Expression_Linha value);

} // Expression1
