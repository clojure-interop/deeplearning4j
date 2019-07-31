(ns tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder]))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder this]
    (-> this (.getNameBytes))))

(defn has-value?
  ".tensorflow.AttrValue value = 2;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder this]
    (-> this (.hasValue))))

(defn get-value
  ".tensorflow.AttrValue value = 2;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder this]
    (-> this (.getValue))))

(defn get-value-or-builder
  ".tensorflow.AttrValue value = 2;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder this]
    (-> this (.getValueOrBuilder))))

