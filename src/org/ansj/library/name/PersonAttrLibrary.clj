(ns org.ansj.library.name.PersonAttrLibrary
  "人名标注所用的词典就是简单的hashmap简单方便谁用谁知道,只在加载词典的时候用"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library.name PersonAttrLibrary]))

(defn ->person-attr-library
  "Constructor."
  (^PersonAttrLibrary []
    (new PersonAttrLibrary )))

(defn get-person-map
  "returns: `java.util.HashMap<java.lang.String,org.ansj.domain.PersonNatureAttr>`"
  (^java.util.HashMap [^PersonAttrLibrary this]
    (-> this (.getPersonMap))))

