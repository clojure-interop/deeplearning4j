(ns org.datavec.api.transform.serde.legacy.LegacyMappingHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.serde.legacy LegacyMappingHelper]))

(defn ->legacy-mapping-helper
  "Constructor."
  (^LegacyMappingHelper []
    (new LegacyMappingHelper )))

(defn *legacy-mapping-for-class
  "c - `java.lang.Class`

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^java.lang.Class c]
    (LegacyMappingHelper/legacyMappingForClass c)))

(defn *get-legacy-mapping-image-transform
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map []
    (LegacyMappingHelper/getLegacyMappingImageTransform )))

