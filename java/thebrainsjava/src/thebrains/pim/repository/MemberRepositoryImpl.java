package thebrains.pim.repository;

import java.util.List;

public class MemberRepositoryImpl<T> implements MemberRepository<T> {
	public List<T> memberList = null;

	public int create(T member) {
		int ret = 0;
		try {
			memberList.add(member);
			ret = 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return ret;
	}

	@Override
	public T readById(T member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T readByEmail(T member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> readList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(T member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(T member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> readListByPhone(T member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> readListByName(String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> readListByPerPage(int page, int perPage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMemberList(List<T> memberList) {
		this.memberList = memberList;

	}

}
