/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getLabeledStmt <em>Labeled Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getSimpleStmt <em>Simple Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getGoStmt <em>Go Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getReturnStmt <em>Return Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getBreakStmt <em>Break Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getContinueStmt <em>Continue Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getGotoStmt <em>Goto Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getFallthroughStmt <em>Fallthrough Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getIfStmt <em>If Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getSwitchStmt <em>Switch Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getSelectStmt <em>Select Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getForStmt <em>For Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement#getDeferStmt <em>Defer Stmt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(Declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Declaration()
   * @model containment="true"
   * @generated
   */
  Declaration getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(Declaration value);

  /**
   * Returns the value of the '<em><b>Labeled Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labeled Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labeled Stmt</em>' containment reference.
   * @see #setLabeledStmt(LabeledStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_LabeledStmt()
   * @model containment="true"
   * @generated
   */
  LabeledStmt getLabeledStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getLabeledStmt <em>Labeled Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Labeled Stmt</em>' containment reference.
   * @see #getLabeledStmt()
   * @generated
   */
  void setLabeledStmt(LabeledStmt value);

  /**
   * Returns the value of the '<em><b>Simple Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Stmt</em>' containment reference.
   * @see #setSimpleStmt(SimpleStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_SimpleStmt()
   * @model containment="true"
   * @generated
   */
  SimpleStmt getSimpleStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getSimpleStmt <em>Simple Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Stmt</em>' containment reference.
   * @see #getSimpleStmt()
   * @generated
   */
  void setSimpleStmt(SimpleStmt value);

  /**
   * Returns the value of the '<em><b>Go Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Go Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Go Stmt</em>' containment reference.
   * @see #setGoStmt(GoStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_GoStmt()
   * @model containment="true"
   * @generated
   */
  GoStmt getGoStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getGoStmt <em>Go Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Go Stmt</em>' containment reference.
   * @see #getGoStmt()
   * @generated
   */
  void setGoStmt(GoStmt value);

  /**
   * Returns the value of the '<em><b>Return Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Stmt</em>' containment reference.
   * @see #setReturnStmt(ReturnStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_ReturnStmt()
   * @model containment="true"
   * @generated
   */
  ReturnStmt getReturnStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getReturnStmt <em>Return Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Stmt</em>' containment reference.
   * @see #getReturnStmt()
   * @generated
   */
  void setReturnStmt(ReturnStmt value);

  /**
   * Returns the value of the '<em><b>Break Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Break Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Break Stmt</em>' containment reference.
   * @see #setBreakStmt(BreakStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_BreakStmt()
   * @model containment="true"
   * @generated
   */
  BreakStmt getBreakStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getBreakStmt <em>Break Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Break Stmt</em>' containment reference.
   * @see #getBreakStmt()
   * @generated
   */
  void setBreakStmt(BreakStmt value);

  /**
   * Returns the value of the '<em><b>Continue Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continue Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continue Stmt</em>' containment reference.
   * @see #setContinueStmt(ContinueStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_ContinueStmt()
   * @model containment="true"
   * @generated
   */
  ContinueStmt getContinueStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getContinueStmt <em>Continue Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continue Stmt</em>' containment reference.
   * @see #getContinueStmt()
   * @generated
   */
  void setContinueStmt(ContinueStmt value);

  /**
   * Returns the value of the '<em><b>Goto Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goto Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto Stmt</em>' containment reference.
   * @see #setGotoStmt(GotoStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_GotoStmt()
   * @model containment="true"
   * @generated
   */
  GotoStmt getGotoStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getGotoStmt <em>Goto Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto Stmt</em>' containment reference.
   * @see #getGotoStmt()
   * @generated
   */
  void setGotoStmt(GotoStmt value);

  /**
   * Returns the value of the '<em><b>Fallthrough Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fallthrough Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fallthrough Stmt</em>' containment reference.
   * @see #setFallthroughStmt(FallthroughStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_FallthroughStmt()
   * @model containment="true"
   * @generated
   */
  FallthroughStmt getFallthroughStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getFallthroughStmt <em>Fallthrough Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fallthrough Stmt</em>' containment reference.
   * @see #getFallthroughStmt()
   * @generated
   */
  void setFallthroughStmt(FallthroughStmt value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

  /**
   * Returns the value of the '<em><b>If Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Stmt</em>' containment reference.
   * @see #setIfStmt(IfStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_IfStmt()
   * @model containment="true"
   * @generated
   */
  IfStmt getIfStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getIfStmt <em>If Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Stmt</em>' containment reference.
   * @see #getIfStmt()
   * @generated
   */
  void setIfStmt(IfStmt value);

  /**
   * Returns the value of the '<em><b>Switch Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Stmt</em>' containment reference.
   * @see #setSwitchStmt(SwitchStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_SwitchStmt()
   * @model containment="true"
   * @generated
   */
  SwitchStmt getSwitchStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getSwitchStmt <em>Switch Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Stmt</em>' containment reference.
   * @see #getSwitchStmt()
   * @generated
   */
  void setSwitchStmt(SwitchStmt value);

  /**
   * Returns the value of the '<em><b>Select Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Stmt</em>' containment reference.
   * @see #setSelectStmt(SelectStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_SelectStmt()
   * @model containment="true"
   * @generated
   */
  SelectStmt getSelectStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getSelectStmt <em>Select Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Stmt</em>' containment reference.
   * @see #getSelectStmt()
   * @generated
   */
  void setSelectStmt(SelectStmt value);

  /**
   * Returns the value of the '<em><b>For Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Stmt</em>' containment reference.
   * @see #setForStmt(ForStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_ForStmt()
   * @model containment="true"
   * @generated
   */
  ForStmt getForStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getForStmt <em>For Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Stmt</em>' containment reference.
   * @see #getForStmt()
   * @generated
   */
  void setForStmt(ForStmt value);

  /**
   * Returns the value of the '<em><b>Defer Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defer Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defer Stmt</em>' containment reference.
   * @see #setDeferStmt(DeferStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_DeferStmt()
   * @model containment="true"
   * @generated
   */
  DeferStmt getDeferStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Statement#getDeferStmt <em>Defer Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defer Stmt</em>' containment reference.
   * @see #getDeferStmt()
   * @generated
   */
  void setDeferStmt(DeferStmt value);

} // Statement
