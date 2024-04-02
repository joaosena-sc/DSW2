package model;

import java.util.ArrayList;
import java.util.List;

public class SessionManager {
	private static List<Session> sessions = new ArrayList<>();
	
	public static List<Session> getSessions(){
		return sessions;
	}
	public static void addSession(Session session){
		sessions.add(session);
	}
	public static void deleteSession(int sessionId) {
		sessions.removeIf(session -> session.getSessionId() == sessionId);
	}
}
