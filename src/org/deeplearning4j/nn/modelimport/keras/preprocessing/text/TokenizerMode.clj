(ns org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.preprocessing.text TokenizerMode]))

(def BINARY
  "Enum Constant.

  type: org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode"
  TokenizerMode/BINARY)

(def COUNT
  "Enum Constant.

  type: org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode"
  TokenizerMode/COUNT)

(def TFIDF
  "Enum Constant.

  type: org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode"
  TokenizerMode/TFIDF)

(def FREQ
  "Enum Constant.

  type: org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode"
  TokenizerMode/FREQ)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (TokenizerMode c : TokenizerMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode[]`"
  ([]
    (TokenizerMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.modelimport.keras.preprocessing.text.TokenizerMode [^java.lang.String name]
    (TokenizerMode/valueOf name)))

