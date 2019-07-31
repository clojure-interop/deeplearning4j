(ns org.deeplearning4j.nn.conf.CacheMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf CacheMode]))

(def DEVICE
  "Enum Constant.

  Device memory will be used for cache (if current backend support such differentiation)

  type: org.deeplearning4j.nn.conf.CacheMode"
  CacheMode/DEVICE)

(def HOST
  "Enum Constant.

  Host memory will be used for cache

  type: org.deeplearning4j.nn.conf.CacheMode"
  CacheMode/HOST)

(def NONE
  "Enum Constant.

  Cache won't be used during training

  type: org.deeplearning4j.nn.conf.CacheMode"
  CacheMode/NONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (CacheMode c : CacheMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.CacheMode[]`"
  ([]
    (CacheMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.CacheMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.CacheMode [^java.lang.String name]
    (CacheMode/valueOf name)))

