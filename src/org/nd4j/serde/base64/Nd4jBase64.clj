(ns org.nd4j.serde.base64.Nd4jBase64
  "NDArray as base 64"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.serde.base64 Nd4jBase64]))

(defn *multiple?
  "Returns true if the base64
  contains multiple arrays
  This is delimited by tab

  base-64 - the base 64 to test - `java.lang.String`

  returns: true if the given base 64
  is tab delimited or not - `boolean`"
  (^Boolean [^java.lang.String base-64]
    (Nd4jBase64/isMultiple base-64)))

(defn *arrays-from-base-64
  "Returns a set of arrays
  from base 64 that is tab delimited.

  base-64 - the base 64 that's tab delimited - `java.lang.String`

  returns: the set of arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`

  throws: java.io.IOException"
  ([^java.lang.String base-64]
    (Nd4jBase64/arraysFromBase64 base-64)))

(defn *arrays-to-base-64
  "Returns a tab delimited base 64
  representation of the given arrays

  arrays - the arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [arrays]
    (Nd4jBase64/arraysToBase64 arrays)))

(defn *base-64-string-numpy
  "Convert an INDArray
  to numpy byte array using
  Nd4j.toNpyByteArray(INDArray)

  arr - the input array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the base 64ed binary - `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4jBase64/base64StringNumpy arr)))

(defn *from-npy-base-64
  "Convert a numpy array from base64
  to a byte array and then
  create an INDArray
  from Nd4j.createNpyFromByteArray(byte[])

  base-64 - the base 64 byte array - `java.lang.String`

  returns: the created INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.String base-64]
    (Nd4jBase64/fromNpyBase64 base-64)))

(defn *base-64-string
  "Returns an ndarray
  as base 64

  arr - the array to write - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the base 64 representation of the binary
  ndarray - `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4jBase64/base64String arr)))

(defn *from-base-64
  "Create an ndarray from a base 64
  representation

  base-64 - the base 64 to convert - `java.lang.String`

  returns: the ndarray from base 64 - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.String base-64]
    (Nd4jBase64/fromBase64 base-64)))

