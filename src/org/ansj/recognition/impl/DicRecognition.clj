(ns org.ansj.recognition.impl.DicRecognition
  "用户自定词典识别 多本词典加入后将不再具有先后顺序,合并后统一规划.如果需要先后顺序请分别每个词典调用 Result.Recognition().Recognition() 这种方式 TODO:这种写灵活性是够了,但是速度不咋地.发愁........该不该这么写.先保留吧..也许在下一个版本中来做把"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl DicRecognition]))

(defn ->dic-recognition
  "Constructor.

  keys - `java.lang.String[]`"
  (^DicRecognition [keys]
    (new DicRecognition keys))
  (^DicRecognition []
    (new DicRecognition )))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^DicRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

