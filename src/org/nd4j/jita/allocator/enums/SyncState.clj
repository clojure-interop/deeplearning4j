(ns org.nd4j.jita.allocator.enums.SyncState
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.enums SyncState]))

(def UNDEFINED
  "Enum Constant.

  Deprecated.

  type: org.nd4j.jita.allocator.enums.SyncState"
  SyncState/UNDEFINED)

(def DESYNC
  "Enum Constant.

  Deprecated.

  type: org.nd4j.jita.allocator.enums.SyncState"
  SyncState/DESYNC)

(def SYNC
  "Enum Constant.

  Deprecated.

  type: org.nd4j.jita.allocator.enums.SyncState"
  SyncState/SYNC)

(def PARTIAL
  "Enum Constant.

  Deprecated.

  type: org.nd4j.jita.allocator.enums.SyncState"
  SyncState/PARTIAL)

(defn *values
  "Deprecated.

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.jita.allocator.enums.SyncState[]`"
  ([]
    (SyncState/values )))

(defn *value-of
  "Deprecated.

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.jita.allocator.enums.SyncState`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.jita.allocator.enums.SyncState [^java.lang.String name]
    (SyncState/valueOf name)))

