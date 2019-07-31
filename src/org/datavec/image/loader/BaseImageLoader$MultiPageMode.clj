(ns org.datavec.image.loader.BaseImageLoader$MultiPageMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader BaseImageLoader$MultiPageMode]))

(def MINIBATCH
  "Enum Constant.

  type: org.datavec.image.loader.BaseImageLoader$MultiPageMode"
  BaseImageLoader$MultiPageMode/MINIBATCH)

(def CHANNELS
  "Enum Constant.

  type: org.datavec.image.loader.BaseImageLoader$MultiPageMode"
  BaseImageLoader$MultiPageMode/CHANNELS)

(def FIRST
  "Enum Constant.

  type: org.datavec.image.loader.BaseImageLoader$MultiPageMode"
  BaseImageLoader$MultiPageMode/FIRST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (BaseImageLoader.MultiPageMode c : BaseImageLoader.MultiPageMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.image.loader.BaseImageLoader$MultiPageMode[]`"
  ([]
    (BaseImageLoader$MultiPageMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.image.loader.BaseImageLoader$MultiPageMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.image.loader.BaseImageLoader$MultiPageMode [^java.lang.String name]
    (BaseImageLoader$MultiPageMode/valueOf name)))

