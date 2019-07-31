(ns org.nd4j.parameterserver.distributed.enums.NodeRole
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.enums NodeRole]))

(def NONE
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.enums.NodeRole"
  NodeRole/NONE)

(def SHARD
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.enums.NodeRole"
  NodeRole/SHARD)

(def BACKUP
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.enums.NodeRole"
  NodeRole/BACKUP)

(def CLIENT
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.enums.NodeRole"
  NodeRole/CLIENT)

(def MASTER
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.enums.NodeRole"
  NodeRole/MASTER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (NodeRole c : NodeRole.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.parameterserver.distributed.enums.NodeRole[]`"
  ([]
    (NodeRole/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.parameterserver.distributed.enums.NodeRole`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.parameterserver.distributed.enums.NodeRole [^java.lang.String name]
    (NodeRole/valueOf name)))

