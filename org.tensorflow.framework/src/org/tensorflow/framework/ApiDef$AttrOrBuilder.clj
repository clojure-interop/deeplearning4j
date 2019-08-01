(ns org.tensorflow.framework.ApiDef$AttrOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$AttrOrBuilder]))

(defn get-description-bytes
  "Note: this will replace any inherited attr doc, there is no current
   way of modifying attr descriptions as can be done with op descriptions.
  string description = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$AttrOrBuilder this]
    (-> this (.getDescriptionBytes))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$AttrOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-default-value-or-builder
  "Specify a new default value to use for this attr.  This default
   will be used when creating new graphs, as opposed to the
   default in the OpDef, which will be used when interpreting old
   GraphDefs.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^ApiDef$AttrOrBuilder this]
    (-> this (.getDefaultValueOrBuilder))))

(defn get-default-value
  "Specify a new default value to use for this attr.  This default
   will be used when creating new graphs, as opposed to the
   default in the OpDef, which will be used when interpreting old
   GraphDefs.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^ApiDef$AttrOrBuilder this]
    (-> this (.getDefaultValue))))

(defn get-rename-to-bytes
  "Change the name used to access this attr in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$AttrOrBuilder this]
    (-> this (.getRenameToBytes))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$AttrOrBuilder this]
    (-> this (.getName))))

(defn get-description
  "Note: this will replace any inherited attr doc, there is no current
   way of modifying attr descriptions as can be done with op descriptions.
  string description = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$AttrOrBuilder this]
    (-> this (.getDescription))))

(defn has-default-value?
  "Specify a new default value to use for this attr.  This default
   will be used when creating new graphs, as opposed to the
   default in the OpDef, which will be used when interpreting old
   GraphDefs.
  .tensorflow.AttrValue default_value = 3;

  returns: `boolean`"
  (^Boolean [^ApiDef$AttrOrBuilder this]
    (-> this (.hasDefaultValue))))

(defn get-rename-to
  "Change the name used to access this attr in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$AttrOrBuilder this]
    (-> this (.getRenameTo))))

