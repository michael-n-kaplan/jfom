/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Intrinsic Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jfom.JFOMPackage#getIntrinsicType()
 * @model
 * @generated
 */
public enum IntrinsicType implements Enumerator {
	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(0, "integer", "integer"),

	/**
	 * The '<em><b>Real</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(1, "real", "real"),

	/**
	 * The '<em><b>Double Precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_PRECISION(2, "doublePrecision", "doublePrecision"),

	/**
	 * The '<em><b>Complex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEX(3, "complex", "complex"),

	/**
	 * The '<em><b>Character</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTER(4, "character", "character"),

	/**
	 * The '<em><b>Logical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL(5, "logical", "logical");

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Real</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Real</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model name="real"
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 1;

	/**
	 * The '<em><b>Double Precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double Precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION
	 * @model name="doublePrecision"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_PRECISION_VALUE = 2;

	/**
	 * The '<em><b>Complex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complex</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLEX
	 * @model name="complex"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEX_VALUE = 3;

	/**
	 * The '<em><b>Character</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Character</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER
	 * @model name="character"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_VALUE = 4;

	/**
	 * The '<em><b>Logical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGICAL
	 * @model name="logical"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Intrinsic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntrinsicType[] VALUES_ARRAY =
		new IntrinsicType[] {
			INTEGER,
			REAL,
			DOUBLE_PRECISION,
			COMPLEX,
			CHARACTER,
			LOGICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Intrinsic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntrinsicType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Intrinsic Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntrinsicType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntrinsicType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intrinsic Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntrinsicType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntrinsicType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intrinsic Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntrinsicType get(int value) {
		switch (value) {
			case INTEGER_VALUE: return INTEGER;
			case REAL_VALUE: return REAL;
			case DOUBLE_PRECISION_VALUE: return DOUBLE_PRECISION;
			case COMPLEX_VALUE: return COMPLEX;
			case CHARACTER_VALUE: return CHARACTER;
			case LOGICAL_VALUE: return LOGICAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IntrinsicType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IntrinsicType
