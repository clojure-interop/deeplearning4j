(ns org.deeplearning4j.ui.UiConnectionInfo$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui UiConnectionInfo$Builder]))

(defn ->builder
  "Constructor."
  (^UiConnectionInfo$Builder []
    (new UiConnectionInfo$Builder )))

(defn set-session-id
  "This method allows you to specify sessionId for this UiConnectionInfo instance
  PLEASE NOTE: This is not recommended. Advised behaviour - keep it random, as is.

  session-id - `java.lang.String`

  returns: `org.deeplearning4j.ui.UiConnectionInfo$Builder`"
  (^org.deeplearning4j.ui.UiConnectionInfo$Builder [^UiConnectionInfo$Builder this ^java.lang.String session-id]
    (-> this (.setSessionId session-id))))

(defn set-login
  "login - `java.lang.String`

  returns: `org.deeplearning4j.ui.UiConnectionInfo$Builder`"
  (^org.deeplearning4j.ui.UiConnectionInfo$Builder [^UiConnectionInfo$Builder this ^java.lang.String login]
    (-> this (.setLogin login))))

(defn set-password
  "password - `java.lang.String`

  returns: `org.deeplearning4j.ui.UiConnectionInfo$Builder`"
  (^org.deeplearning4j.ui.UiConnectionInfo$Builder [^UiConnectionInfo$Builder this ^java.lang.String password]
    (-> this (.setPassword password))))

(defn set-address
  "address - `java.lang.String`

  returns: `org.deeplearning4j.ui.UiConnectionInfo$Builder`"
  (^org.deeplearning4j.ui.UiConnectionInfo$Builder [^UiConnectionInfo$Builder this ^java.lang.String address]
    (-> this (.setAddress address))))

(defn set-port
  "port - `int`

  returns: `org.deeplearning4j.ui.UiConnectionInfo$Builder`"
  (^org.deeplearning4j.ui.UiConnectionInfo$Builder [^UiConnectionInfo$Builder this ^Integer port]
    (-> this (.setPort port))))

(defn enable-https
  "really-enable - `boolean`

  returns: `org.deeplearning4j.ui.UiConnectionInfo$Builder`"
  (^org.deeplearning4j.ui.UiConnectionInfo$Builder [^UiConnectionInfo$Builder this ^Boolean really-enable]
    (-> this (.enableHttps really-enable))))

(defn set-path
  "If you're using UiServer as servlet, located not at root folder of webserver (i.e. http://yourdomain.com/somepath/webui/), you can set path here.
  For provided example path will be \"/somepath/webui/\"

  path - `java.lang.String`

  returns: `org.deeplearning4j.ui.UiConnectionInfo$Builder`"
  (^org.deeplearning4j.ui.UiConnectionInfo$Builder [^UiConnectionInfo$Builder this ^java.lang.String path]
    (-> this (.setPath path))))

(defn build
  "returns: `org.deeplearning4j.ui.UiConnectionInfo`"
  (^org.deeplearning4j.ui.UiConnectionInfo [^UiConnectionInfo$Builder this]
    (-> this (.build))))

