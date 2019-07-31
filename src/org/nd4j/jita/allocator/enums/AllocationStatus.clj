(ns org.nd4j.jita.allocator.enums.AllocationStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.enums AllocationStatus]))

(def UNDEFINED
  "Enum Constant.

  type: org.nd4j.jita.allocator.enums.AllocationStatus"
  AllocationStatus/UNDEFINED)

(def HOST
  "Enum Constant.

  type: org.nd4j.jita.allocator.enums.AllocationStatus"
  AllocationStatus/HOST)

(def DEVICE
  "Enum Constant.

  type: org.nd4j.jita.allocator.enums.AllocationStatus"
  AllocationStatus/DEVICE)

(def DELAYED
  "Enum Constant.

  type: org.nd4j.jita.allocator.enums.AllocationStatus"
  AllocationStatus/DELAYED)

(def DEALLOCATED
  "Enum Constant.

  type: org.nd4j.jita.allocator.enums.AllocationStatus"
  AllocationStatus/DEALLOCATED)

(def CONSTANT
  "Enum Constant.

  type: org.nd4j.jita.allocator.enums.AllocationStatus"
  AllocationStatus/CONSTANT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (AllocationStatus c : AllocationStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.jita.allocator.enums.AllocationStatus[]`"
  ([]
    (AllocationStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.jita.allocator.enums.AllocationStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.jita.allocator.enums.AllocationStatus [^java.lang.String name]
    (AllocationStatus/valueOf name)))

