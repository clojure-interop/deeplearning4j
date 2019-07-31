(ns org.nd4j.linalg.compression.CompressionAlgorithm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression CompressionAlgorithm]))

(def FLOAT8
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/FLOAT8)

(def FLOAT16
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/FLOAT16)

(def GZIP
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/GZIP)

(def INT8
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/INT8)

(def INT16
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/INT16)

(def NOOP
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/NOOP)

(def UNIT8
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/UNIT8)

(def CUSTOM
  "Enum Constant.

  type: org.nd4j.linalg.compression.CompressionAlgorithm"
  CompressionAlgorithm/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (CompressionAlgorithm c : CompressionAlgorithm.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.compression.CompressionAlgorithm[]`"
  ([]
    (CompressionAlgorithm/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.compression.CompressionAlgorithm`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.compression.CompressionAlgorithm [^java.lang.String name]
    (CompressionAlgorithm/valueOf name)))

(defn *from-string
  "Return the appropriate compression algorithm
  from the given string

  algorithm - the algorithm to return - `java.lang.String`

  returns: the compression algorithm from the given string
  or an IllegalArgumentException if the algorithm is invalid - `org.nd4j.linalg.compression.CompressionAlgorithm`"
  (^org.nd4j.linalg.compression.CompressionAlgorithm [^java.lang.String algorithm]
    (CompressionAlgorithm/fromString algorithm)))

