(ns org.deeplearning4j.nn.workspace.ArrayType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.workspace ArrayType]))

(def INPUT
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/INPUT)

(def ACTIVATIONS
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/ACTIVATIONS)

(def ACTIVATION_GRAD
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/ACTIVATION_GRAD)

(def FF_WORKING_MEM
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/FF_WORKING_MEM)

(def BP_WORKING_MEM
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/BP_WORKING_MEM)

(def RNN_FF_LOOP_WORKING_MEM
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/RNN_FF_LOOP_WORKING_MEM)

(def RNN_BP_LOOP_WORKING_MEM
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/RNN_BP_LOOP_WORKING_MEM)

(def UPDATER_WORKING_MEM
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/UPDATER_WORKING_MEM)

(def FF_CACHE
  "Enum Constant.

  type: org.deeplearning4j.nn.workspace.ArrayType"
  ArrayType/FF_CACHE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ArrayType c : ArrayType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.workspace.ArrayType[]`"
  ([]
    (ArrayType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.workspace.ArrayType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.workspace.ArrayType [^java.lang.String name]
    (ArrayType/valueOf name)))

