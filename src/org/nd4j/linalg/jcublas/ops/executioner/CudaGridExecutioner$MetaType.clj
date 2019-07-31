(ns org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.ops.executioner CudaGridExecutioner$MetaType]))

(def NOT_APPLICABLE
  "Enum Constant.

  type: org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType"
  CudaGridExecutioner$MetaType/NOT_APPLICABLE)

(def PREDICATE
  "Enum Constant.

  type: org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType"
  CudaGridExecutioner$MetaType/PREDICATE)

(def INVERTED_PREDICATE
  "Enum Constant.

  type: org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType"
  CudaGridExecutioner$MetaType/INVERTED_PREDICATE)

(def POSTULATE
  "Enum Constant.

  type: org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType"
  CudaGridExecutioner$MetaType/POSTULATE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (CudaGridExecutioner.MetaType c : CudaGridExecutioner.MetaType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType[]`"
  ([]
    (CudaGridExecutioner$MetaType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner$MetaType [^java.lang.String name]
    (CudaGridExecutioner$MetaType/valueOf name)))

