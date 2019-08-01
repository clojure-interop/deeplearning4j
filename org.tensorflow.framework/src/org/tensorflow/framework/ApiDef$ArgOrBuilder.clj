(ns org.tensorflow.framework.ApiDef$ArgOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$ArgOrBuilder]))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$ArgOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$ArgOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-rename-to
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$ArgOrBuilder this]
    (-> this (.getRenameTo))))

(defn get-rename-to-bytes
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$ArgOrBuilder this]
    (-> this (.getRenameToBytes))))

(defn get-description
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$ArgOrBuilder this]
    (-> this (.getDescription))))

(defn get-description-bytes
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$ArgOrBuilder this]
    (-> this (.getDescriptionBytes))))

