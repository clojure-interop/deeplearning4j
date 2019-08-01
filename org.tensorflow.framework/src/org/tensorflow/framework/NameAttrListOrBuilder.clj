(ns org.tensorflow.framework.NameAttrListOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NameAttrListOrBuilder]))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NameAttrListOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NameAttrListOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-attr-count
  "map<string, .tensorflow.AttrValue> attr = 2;

  returns: `int`"
  (^Integer [^NameAttrListOrBuilder this]
    (-> this (.getAttrCount))))

(defn contains-attr
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^NameAttrListOrBuilder this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NameAttrListOrBuilder this]
    (-> this (.getAttr))))

(defn get-attr-map
  "map<string, .tensorflow.AttrValue> attr = 2;

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NameAttrListOrBuilder this]
    (-> this (.getAttrMap))))

(defn get-attr-or-default
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`
  default-value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NameAttrListOrBuilder this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn get-attr-or-throw
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NameAttrListOrBuilder this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

