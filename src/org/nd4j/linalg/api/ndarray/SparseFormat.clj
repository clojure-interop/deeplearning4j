(ns org.nd4j.linalg.api.ndarray.SparseFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray SparseFormat]))

(def CSR
  "Enum Constant.

  type: org.nd4j.linalg.api.ndarray.SparseFormat"
  SparseFormat/CSR)

(def COO
  "Enum Constant.

  type: org.nd4j.linalg.api.ndarray.SparseFormat"
  SparseFormat/COO)

(def NONE
  "Enum Constant.

  type: org.nd4j.linalg.api.ndarray.SparseFormat"
  SparseFormat/NONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SparseFormat c : SparseFormat.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ndarray.SparseFormat[]`"
  ([]
    (SparseFormat/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ndarray.SparseFormat`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ndarray.SparseFormat [^java.lang.String name]
    (SparseFormat/valueOf name)))

