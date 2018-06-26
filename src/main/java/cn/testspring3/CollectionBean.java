package cn.testspring3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * @return the set
	 */
	public Set<String> getSet() {
		return set;
	}

	/**
	 * @param set
	 *            the set to set
	 */
	public void setSet(Set<String> set) {
		this.set = set;
	}

	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}

	/**
	 * @param map
	 *            the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CollectionBean [list=" + list + ", set=" + set + ", map=" + map + "]";
	}

}
