package com.nt.service;

import com.nt.external.ExternalIPLScoreComp;

public class CBFindScoreService {

	ExternalIPLScoreComp extcomp;
	public CBFindScoreService(ExternalIPLScoreComp extcomp) {
		this.extcomp=extcomp;
	}
	public String findScore(int mid) {
		String score=null;
		score=extcomp.getScore(mid);
		return score;
	}

}
