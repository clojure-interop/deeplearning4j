(ns org.ansj.util.TermUtil$InsertTermType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util TermUtil$InsertTermType]))

(def SKIP
  "Enum Constant.

  跳过 0

  type: org.ansj.util.TermUtil$InsertTermType"
  TermUtil$InsertTermType/SKIP)

(def REPLACE
  "Enum Constant.

  替换 1

  type: org.ansj.util.TermUtil$InsertTermType"
  TermUtil$InsertTermType/REPLACE)

(def SCORE_ADD_SORT
  "Enum Constant.

  累积分值 保证顺序,由大到小 2

  type: org.ansj.util.TermUtil$InsertTermType"
  TermUtil$InsertTermType/SCORE_ADD_SORT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (TermUtil.InsertTermType c : TermUtil.InsertTermType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.ansj.util.TermUtil$InsertTermType[]`"
  ([]
    (TermUtil$InsertTermType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.ansj.util.TermUtil$InsertTermType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.ansj.util.TermUtil$InsertTermType [^java.lang.String name]
    (TermUtil$InsertTermType/valueOf name)))

