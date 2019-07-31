(ns vizdoom.Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom Mode]))

(def PLAYER
  "Enum Constant.

  type: vizdoom.Mode"
  Mode/PLAYER)

(def SPECTATOR
  "Enum Constant.

  type: vizdoom.Mode"
  Mode/SPECTATOR)

(def ASYNC_PLAYER
  "Enum Constant.

  type: vizdoom.Mode"
  Mode/ASYNC_PLAYER)

(def ASYNC_SPECTATOR
  "Enum Constant.

  type: vizdoom.Mode"
  Mode/ASYNC_SPECTATOR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Mode c : Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `vizdoom.Mode[]`"
  ([]
    (Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `vizdoom.Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^vizdoom.Mode [^java.lang.String name]
    (Mode/valueOf name)))

