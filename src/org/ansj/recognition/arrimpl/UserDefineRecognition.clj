(ns org.ansj.recognition.arrimpl.UserDefineRecognition
  "用户自定义词典.又称补充词典"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.arrimpl UserDefineRecognition]))

(defn ->user-define-recognition
  "Constructor.

  type - `org.ansj.util.TermUtil$InsertTermType`
  forests - `org.nlpcn.commons.lang.tire.domain.Forest`"
  (^UserDefineRecognition [^org.ansj.util.TermUtil$InsertTermType type ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (new UserDefineRecognition type forests)))

(def *-logger
  "Static Constant.

  type: org.nlpcn.commons.lang.util.logging.Log"
  UserDefineRecognition/logger)

(defn recognition
  "terms - `org.ansj.domain.Term[]`"
  ([^UserDefineRecognition this terms]
    (-> this (.recognition terms))))

