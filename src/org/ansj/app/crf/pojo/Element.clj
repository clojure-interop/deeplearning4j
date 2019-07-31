(ns org.ansj.app.crf.pojo.Element
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf.pojo Element]))

(defn ->element
  "Constructor.

  name - `java.lang.Character`
  tag - `int`"
  (^Element [^java.lang.Character name ^Integer tag]
    (new Element name tag))
  (^Element [^Character name]
    (new Element name)))

(defn name
  "Instance Field.

  type: char"
  (^Character [^Element this]
    (-> this .-name)))

(defn len
  "Instance Field.

  type: int"
  (^Integer [^Element this]
    (-> this .-len)))

(defn nature
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Element this]
    (-> this .-nature)))

(defn tag-score
  "Instance Field.

  type: float[]"
  ([^Element this]
    (-> this .-tagScore)))

(defn from
  "Instance Field.

  type: int[]"
  ([^Element this]
    (-> this .-from)))

(defn get-tag
  "returns: `int`"
  (^Integer [^Element this]
    (-> this (.getTag))))

(defn update-tag
  "tag - `int`

  returns: `org.ansj.app.crf.pojo.Element`"
  (^org.ansj.app.crf.pojo.Element [^Element this ^Integer tag]
    (-> this (.updateTag tag))))

(defn update-nature
  "nature - `java.lang.String`

  returns: `org.ansj.app.crf.pojo.Element`"
  (^org.ansj.app.crf.pojo.Element [^Element this ^java.lang.String nature]
    (-> this (.updateNature nature))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Element this]
    (-> this (.toString))))

(defn get-name
  "returns: `char`"
  (^Character [^Element this]
    (-> this (.getName))))

(defn name-str
  "获得可见的名称

  returns: `java.lang.String`"
  (^java.lang.String [^Element this]
    (-> this (.nameStr))))

(defn max-from
  "model - `org.ansj.app.crf.Model`
  element - `org.ansj.app.crf.pojo.Element`"
  ([^Element this ^org.ansj.app.crf.Model model ^org.ansj.app.crf.pojo.Element element]
    (-> this (.maxFrom model element))))

