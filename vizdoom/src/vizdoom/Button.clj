(ns vizdoom.Button
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom Button]))

(def ATTACK
  "Enum Constant.

  type: vizdoom.Button"
  Button/ATTACK)

(def USE
  "Enum Constant.

  type: vizdoom.Button"
  Button/USE)

(def JUMP
  "Enum Constant.

  type: vizdoom.Button"
  Button/JUMP)

(def CROUCH
  "Enum Constant.

  type: vizdoom.Button"
  Button/CROUCH)

(def TURN180
  "Enum Constant.

  type: vizdoom.Button"
  Button/TURN180)

(def ALTATTACK
  "Enum Constant.

  type: vizdoom.Button"
  Button/ALTATTACK)

(def RELOAD
  "Enum Constant.

  type: vizdoom.Button"
  Button/RELOAD)

(def ZOOM
  "Enum Constant.

  type: vizdoom.Button"
  Button/ZOOM)

(def SPEED
  "Enum Constant.

  type: vizdoom.Button"
  Button/SPEED)

(def STRAFE
  "Enum Constant.

  type: vizdoom.Button"
  Button/STRAFE)

(def MOVE_RIGHT
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_RIGHT)

(def MOVE_LEFT
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_LEFT)

(def MOVE_BACKWARD
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_BACKWARD)

(def MOVE_FORWARD
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_FORWARD)

(def TURN_RIGHT
  "Enum Constant.

  type: vizdoom.Button"
  Button/TURN_RIGHT)

(def TURN_LEFT
  "Enum Constant.

  type: vizdoom.Button"
  Button/TURN_LEFT)

(def LOOK_UP
  "Enum Constant.

  type: vizdoom.Button"
  Button/LOOK_UP)

(def LOOK_DOWN
  "Enum Constant.

  type: vizdoom.Button"
  Button/LOOK_DOWN)

(def MOVE_UP
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_UP)

(def MOVE_DOWN
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_DOWN)

(def LAND
  "Enum Constant.

  type: vizdoom.Button"
  Button/LAND)

(def SELECT_WEAPON1
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON1)

(def SELECT_WEAPON2
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON2)

(def SELECT_WEAPON3
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON3)

(def SELECT_WEAPON4
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON4)

(def SELECT_WEAPON5
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON5)

(def SELECT_WEAPON6
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON6)

(def SELECT_WEAPON7
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON7)

(def SELECT_WEAPON8
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON8)

(def SELECT_WEAPON9
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON9)

(def SELECT_WEAPON0
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_WEAPON0)

(def SELECT_NEXT_WEAPON
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_NEXT_WEAPON)

(def SELECT_PREV_WEAPON
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_PREV_WEAPON)

(def DROP_SELECTED_WEAPON
  "Enum Constant.

  type: vizdoom.Button"
  Button/DROP_SELECTED_WEAPON)

(def ACTIVATE_SELECTED_ITEM
  "Enum Constant.

  type: vizdoom.Button"
  Button/ACTIVATE_SELECTED_ITEM)

(def SELECT_NEXT_ITEM
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_NEXT_ITEM)

(def SELECT_PREV_ITEM
  "Enum Constant.

  type: vizdoom.Button"
  Button/SELECT_PREV_ITEM)

(def DROP_SELECTED_ITEM
  "Enum Constant.

  type: vizdoom.Button"
  Button/DROP_SELECTED_ITEM)

(def LOOK_UP_DOWN_DELTA
  "Enum Constant.

  type: vizdoom.Button"
  Button/LOOK_UP_DOWN_DELTA)

(def TURN_LEFT_RIGHT_DELTA
  "Enum Constant.

  type: vizdoom.Button"
  Button/TURN_LEFT_RIGHT_DELTA)

(def MOVE_FORWARD_BACKWARD_DELTA
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_FORWARD_BACKWARD_DELTA)

(def MOVE_LEFT_RIGHT_DELTA
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_LEFT_RIGHT_DELTA)

(def MOVE_UP_DOWN_DELTA
  "Enum Constant.

  type: vizdoom.Button"
  Button/MOVE_UP_DOWN_DELTA)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Button c : Button.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `vizdoom.Button[]`"
  ([]
    (Button/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `vizdoom.Button`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^vizdoom.Button [^java.lang.String name]
    (Button/valueOf name)))

