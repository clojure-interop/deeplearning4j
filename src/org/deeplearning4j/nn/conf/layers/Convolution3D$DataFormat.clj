(ns org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Convolution3D$DataFormat]))

(def NCDHW
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat"
  Convolution3D$DataFormat/NCDHW)

(def NDHWC
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat"
  Convolution3D$DataFormat/NDHWC)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Convolution3D.DataFormat c : Convolution3D.DataFormat.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat[]`"
  ([]
    (Convolution3D$DataFormat/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat [^java.lang.String name]
    (Convolution3D$DataFormat/valueOf name)))

