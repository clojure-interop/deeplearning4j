(ns org.ansj.splitWord.Analysis
  "基本分词+人名识别"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord Analysis]))

(defn offe
  "Instance Field.

  用来记录偏移量

  type: int"
  (^Integer [^Analysis this]
    (-> this .-offe)))

(defn set-ambiguity-forest
  "ambiguity-forest - `org.nlpcn.commons.lang.tire.domain.Forest`

  returns: `org.ansj.splitWord.Analysis`"
  (^org.ansj.splitWord.Analysis [^Analysis this ^org.nlpcn.commons.lang.tire.domain.Forest ambiguity-forest]
    (-> this (.setAmbiguityForest ambiguity-forest))))

(defn next
  "while 循环调用.直到返回为null则分词结束

  returns: `org.ansj.domain.Term`

  throws: java.io.IOException"
  (^org.ansj.domain.Term [^Analysis this]
    (-> this (.next))))

(defn set-is-real-name
  "is-real-name - `java.lang.Boolean`

  returns: `org.ansj.splitWord.Analysis`"
  (^org.ansj.splitWord.Analysis [^Analysis this ^java.lang.Boolean is-real-name]
    (-> this (.setIsRealName is-real-name))))

(defn set-is-num-recognition
  "is-num-recognition - `java.lang.Boolean`

  returns: `org.ansj.splitWord.Analysis`"
  (^org.ansj.splitWord.Analysis [^Analysis this ^java.lang.Boolean is-num-recognition]
    (-> this (.setIsNumRecognition is-num-recognition))))

(defn set-is-name-recognition
  "is-name-recognition - `java.lang.Boolean`

  returns: `org.ansj.splitWord.Analysis`"
  (^org.ansj.splitWord.Analysis [^Analysis this ^java.lang.Boolean is-name-recognition]
    (-> this (.setIsNameRecognition is-name-recognition))))

(defn parse-str
  "一句话进行分词并且封装

  temp - `java.lang.String`

  returns: `org.ansj.domain.Result`"
  (^org.ansj.domain.Result [^Analysis this ^java.lang.String temp]
    (-> this (.parseStr temp))))

(defn get-ambiguity-forest
  "returns: `org.nlpcn.commons.lang.tire.domain.Forest`"
  (^org.nlpcn.commons.lang.tire.domain.Forest [^Analysis this]
    (-> this (.getAmbiguityForest))))

(defn set-is-quantifier-recognition
  "is-quantifier-recognition - `java.lang.Boolean`

  returns: `org.ansj.splitWord.Analysis`"
  (^org.ansj.splitWord.Analysis [^Analysis this ^java.lang.Boolean is-quantifier-recognition]
    (-> this (.setIsQuantifierRecognition is-quantifier-recognition))))

(defn reset-content
  "重置分词器

  br - `org.ansj.util.AnsjReader`"
  ([^Analysis this ^org.ansj.util.AnsjReader br]
    (-> this (.resetContent br)))
  ([^Analysis this ^java.io.Reader reader ^Integer buffer]
    (-> this (.resetContent reader buffer))))

(defn parse
  "通过构造方法传入的reader直接获取到分词结果

  returns: `org.ansj.domain.Result`

  throws: java.io.IOException"
  (^org.ansj.domain.Result [^Analysis this]
    (-> this (.parse))))

(defn set-forests
  "forests - `org.nlpcn.commons.lang.tire.domain.Forest`

  returns: `org.ansj.splitWord.Analysis`"
  (^org.ansj.splitWord.Analysis [^Analysis this ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (-> this (.setForests forests))))

