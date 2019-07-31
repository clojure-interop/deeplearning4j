(ns org.deeplearning4j.gym.ClientUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.gym ClientUtils]))

(defn ->client-utils
  "Constructor."
  (^ClientUtils []
    (new ClientUtils )))

(defn *post
  "url - `java.lang.String`
  json - `org.json.JSONObject`

  returns: `com.mashape.unirest.http.JsonNode`"
  (^com.mashape.unirest.http.JsonNode [^java.lang.String url ^org.json.JSONObject json]
    (ClientUtils/post url json)))

(defn *get
  "url - `java.lang.String`

  returns: `org.json.JSONObject`"
  (^org.json.JSONObject [^java.lang.String url]
    (ClientUtils/get url)))

(defn *check-reply
  "res - `com.mashape.unirest.http.HttpResponse`
  url - `java.lang.String`"
  ([^com.mashape.unirest.http.HttpResponse res ^java.lang.String url]
    (ClientUtils/checkReply res url)))

(defn *unirest-crash
  "e - `com.mashape.unirest.http.exceptions.UnirestException`"
  ([^com.mashape.unirest.http.exceptions.UnirestException e]
    (ClientUtils/unirestCrash e)))

