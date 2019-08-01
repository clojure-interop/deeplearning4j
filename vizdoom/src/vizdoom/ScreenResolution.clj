(ns vizdoom.ScreenResolution
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom ScreenResolution]))

(def RES_160X120
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_160X120)

(def RES_200X125
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_200X125)

(def RES_200X150
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_200X150)

(def RES_256X144
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_256X144)

(def RES_256X160
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_256X160)

(def RES_256X192
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_256X192)

(def RES_320X180
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_320X180)

(def RES_320X200
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_320X200)

(def RES_320X240
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_320X240)

(def RES_320X256
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_320X256)

(def RES_400X225
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_400X225)

(def RES_400X250
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_400X250)

(def RES_400X300
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_400X300)

(def RES_512X288
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_512X288)

(def RES_512X320
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_512X320)

(def RES_512X384
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_512X384)

(def RES_640X360
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_640X360)

(def RES_640X400
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_640X400)

(def RES_640X480
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_640X480)

(def RES_800X450
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_800X450)

(def RES_800X500
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_800X500)

(def RES_800X600
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_800X600)

(def RES_1024X576
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1024X576)

(def RES_1024X640
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1024X640)

(def RES_1024X768
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1024X768)

(def RES_1280X720
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1280X720)

(def RES_1280X800
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1280X800)

(def RES_1280X960
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1280X960)

(def RES_1280X1024
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1280X1024)

(def RES_1400X787
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1400X787)

(def RES_1400X875
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1400X875)

(def RES_1400X1050
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1400X1050)

(def RES_1600X900
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1600X900)

(def RES_1600X1000
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1600X1000)

(def RES_1600X1200
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1600X1200)

(def RES_1920X1080
  "Enum Constant.

  type: vizdoom.ScreenResolution"
  ScreenResolution/RES_1920X1080)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ScreenResolution c : ScreenResolution.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `vizdoom.ScreenResolution[]`"
  ([]
    (ScreenResolution/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `vizdoom.ScreenResolution`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^vizdoom.ScreenResolution [^java.lang.String name]
    (ScreenResolution/valueOf name)))

