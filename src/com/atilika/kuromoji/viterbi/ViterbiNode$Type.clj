(ns com.atilika.kuromoji.viterbi.ViterbiNode$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.viterbi ViterbiNode$Type]))

(def KNOWN
  "Enum Constant.

  type: com.atilika.kuromoji.viterbi.ViterbiNode$Type"
  ViterbiNode$Type/KNOWN)

(def UNKNOWN
  "Enum Constant.

  type: com.atilika.kuromoji.viterbi.ViterbiNode$Type"
  ViterbiNode$Type/UNKNOWN)

(def USER
  "Enum Constant.

  type: com.atilika.kuromoji.viterbi.ViterbiNode$Type"
  ViterbiNode$Type/USER)

(def INSERTED
  "Enum Constant.

  type: com.atilika.kuromoji.viterbi.ViterbiNode$Type"
  ViterbiNode$Type/INSERTED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ViterbiNode.Type c : ViterbiNode.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.atilika.kuromoji.viterbi.ViterbiNode$Type[]`"
  ([]
    (ViterbiNode$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.atilika.kuromoji.viterbi.ViterbiNode$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.atilika.kuromoji.viterbi.ViterbiNode$Type [^java.lang.String name]
    (ViterbiNode$Type/valueOf name)))

