(ns vizdoom.ScreenFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom ScreenFormat]))

(def CRCGCB
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/CRCGCB)

(def RGB24
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/RGB24)

(def RGBA32
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/RGBA32)

(def ARGB32
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/ARGB32)

(def CBCGCR
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/CBCGCR)

(def BGR24
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/BGR24)

(def BGRA32
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/BGRA32)

(def ABGR32
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/ABGR32)

(def GRAY8
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/GRAY8)

(def DOOM_256_COLORS8
  "Enum Constant.

  type: vizdoom.ScreenFormat"
  ScreenFormat/DOOM_256_COLORS8)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ScreenFormat c : ScreenFormat.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `vizdoom.ScreenFormat[]`"
  ([]
    (ScreenFormat/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `vizdoom.ScreenFormat`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^vizdoom.ScreenFormat [^java.lang.String name]
    (ScreenFormat/valueOf name)))

