(ns com.atilika.kuromoji.TokenizerBase$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji TokenizerBase$Mode]))

(def NORMAL
  "Enum Constant.

  type: com.atilika.kuromoji.TokenizerBase$Mode"
  TokenizerBase$Mode/NORMAL)

(def SEARCH
  "Enum Constant.

  type: com.atilika.kuromoji.TokenizerBase$Mode"
  TokenizerBase$Mode/SEARCH)

(def EXTENDED
  "Enum Constant.

  type: com.atilika.kuromoji.TokenizerBase$Mode"
  TokenizerBase$Mode/EXTENDED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (TokenizerBase.Mode c : TokenizerBase.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.atilika.kuromoji.TokenizerBase$Mode[]`"
  ([]
    (TokenizerBase$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.atilika.kuromoji.TokenizerBase$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.atilika.kuromoji.TokenizerBase$Mode [^java.lang.String name]
    (TokenizerBase$Mode/valueOf name)))

