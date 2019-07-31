(ns org.nd4j.linalg.api.blas.Blas$Vendor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas Blas$Vendor]))

(def UNKNOWN
  "Enum Constant.

  type: org.nd4j.linalg.api.blas.Blas$Vendor"
  Blas$Vendor/UNKNOWN)

(def CUBLAS
  "Enum Constant.

  type: org.nd4j.linalg.api.blas.Blas$Vendor"
  Blas$Vendor/CUBLAS)

(def OPENBLAS
  "Enum Constant.

  type: org.nd4j.linalg.api.blas.Blas$Vendor"
  Blas$Vendor/OPENBLAS)

(def MKL
  "Enum Constant.

  type: org.nd4j.linalg.api.blas.Blas$Vendor"
  Blas$Vendor/MKL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Blas.Vendor c : Blas.Vendor.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.blas.Blas$Vendor[]`"
  ([]
    (Blas$Vendor/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.blas.Blas$Vendor`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.blas.Blas$Vendor [^java.lang.String name]
    (Blas$Vendor/valueOf name)))

