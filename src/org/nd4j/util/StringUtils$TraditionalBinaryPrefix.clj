(ns org.nd4j.util.StringUtils$TraditionalBinaryPrefix
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util StringUtils$TraditionalBinaryPrefix]))

(def KILO
  "Enum Constant.

  type: org.nd4j.util.StringUtils$TraditionalBinaryPrefix"
  StringUtils$TraditionalBinaryPrefix/KILO)

(def MEGA
  "Enum Constant.

  type: org.nd4j.util.StringUtils$TraditionalBinaryPrefix"
  StringUtils$TraditionalBinaryPrefix/MEGA)

(def GIGA
  "Enum Constant.

  type: org.nd4j.util.StringUtils$TraditionalBinaryPrefix"
  StringUtils$TraditionalBinaryPrefix/GIGA)

(def TERA
  "Enum Constant.

  type: org.nd4j.util.StringUtils$TraditionalBinaryPrefix"
  StringUtils$TraditionalBinaryPrefix/TERA)

(def PETA
  "Enum Constant.

  type: org.nd4j.util.StringUtils$TraditionalBinaryPrefix"
  StringUtils$TraditionalBinaryPrefix/PETA)

(def EXA
  "Enum Constant.

  type: org.nd4j.util.StringUtils$TraditionalBinaryPrefix"
  StringUtils$TraditionalBinaryPrefix/EXA)

(defn value
  "Instance Constant.

  type: long"
  (^Long [^StringUtils$TraditionalBinaryPrefix this]
    (-> this .-value)))

(defn symbol
  "Instance Constant.

  type: char"
  (^Character [^StringUtils$TraditionalBinaryPrefix this]
    (-> this .-symbol)))

(defn bit-shift
  "Instance Constant.

  type: int"
  (^Integer [^StringUtils$TraditionalBinaryPrefix this]
    (-> this .-bitShift)))

(defn bit-mask
  "Instance Constant.

  type: long"
  (^Long [^StringUtils$TraditionalBinaryPrefix this]
    (-> this .-bitMask)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (StringUtils.TraditionalBinaryPrefix c : StringUtils.TraditionalBinaryPrefix.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.util.StringUtils$TraditionalBinaryPrefix[]`"
  ([]
    (StringUtils$TraditionalBinaryPrefix/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.util.StringUtils$TraditionalBinaryPrefix`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.util.StringUtils$TraditionalBinaryPrefix [^java.lang.String name]
    (StringUtils$TraditionalBinaryPrefix/valueOf name)))

(defn *string-2long
  "Convert a string to long.
  The input string is first be trimmed
  and then it is parsed with traditional binary prefix.
  For example,
  \"-1230k\" will be converted to -1230 * 1024 = -1259520;
  \"891g\" will be converted to 891 * 1024^3 = 956703965184;

  s - input string - `java.lang.String`

  returns: a long value represented by the input string. - `long`"
  (^Long [^java.lang.String s]
    (StringUtils$TraditionalBinaryPrefix/string2long s)))

(defn *long-2-string
  "Convert a long integer to a string with traditional binary prefix.

  n - the value to be converted - `long`
  unit - The unit, e.g. \"B\" for bytes. - `java.lang.String`
  decimal-places - The number of decimal places. - `int`

  returns: a string with traditional binary prefix. - `java.lang.String`"
  (^java.lang.String [^Long n ^java.lang.String unit ^Integer decimal-places]
    (StringUtils$TraditionalBinaryPrefix/long2String n unit decimal-places)))

